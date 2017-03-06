package io.udash.wrappers.highcharts

import io.udash.wrappers.highcharts.config._
import io.udash.wrappers.highcharts.config.global.{Global, Lang}
import io.udash.wrappers.jquery._

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.Object

object HighchartsUtils {

  implicit class HighchartsJQuery(val jq: JQuery) extends AnyVal {
    def highcharts[T <: js.Object](chartType: String, config: T): JQuery =
      jq.asInstanceOf[js.Dynamic].highcharts(chartType, config).asInstanceOf[JQuery]

    def highcharts[T <: js.Object](config: T): api.Chart = {
      val cleaned: Object = cleanJsObject(config)
      jq.asInstanceOf[js.Dynamic].highcharts(cleaned).asInstanceOf[io.udash.wrappers.highcharts.api.Chart]
    }

    def highcharts(): api.Chart =
      jq.asInstanceOf[js.Dynamic].highcharts().asInstanceOf[io.udash.wrappers.highcharts.api.Chart]
  }

  def globalSettings: HighchartsConfig = js.Dynamic.global.Highcharts.getOptions().asInstanceOf[HighchartsConfig]

  def setGlobalSettings(global: Option[Global] = None, lang: Option[Lang] = None): Unit = {
    import scala.scalajs.js.JSConverters._
    js.Dynamic.global.Highcharts.setOptions(cleanJsObject(js.Dynamic.literal(
      global = global.orUndefined, lang = lang.orUndefined
    ).asInstanceOf[js.Object]))
  }

  private def cleanJsObject(v: js.Object): js.Object = v match {
    case null =>
      null

    case und if js.isUndefined(und) =>
      js.undefined.asInstanceOf[js.Object]

    case obj =>
      val newObj: js.Object = new js.Object()

      def cleanProperty(p: js.Any): js.Any = p match {
        case array if js.Array.isArray(array) =>
          array.asInstanceOf[js.Array[js.Any]]
            .filterNot(js.isUndefined)
            .map(cleanProperty)

        case subObj if js.typeOf(subObj) == "object" =>
          cleanJsObject(subObj.asInstanceOf[js.Object])

        case newValue =>
          newValue
      }


      val properties = js.Object.keys(obj)
        .filterNot(key => js.isUndefined(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))
        .map(key => key -> cleanProperty(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))

      properties.foreach { case (key, value) =>
        newObj.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      }

      newObj
  }
}
