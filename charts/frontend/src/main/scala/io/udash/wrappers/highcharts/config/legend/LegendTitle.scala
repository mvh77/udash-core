/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package legend

import scala.scalajs.js


@js.annotation.ScalaJSDefined
class LegendTitle extends js.Object {

  /**
    * Generic CSS styles for the legend title.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * A text or HTML string for the title. 
    */
  val text: js.UndefOr[String] = js.undefined
}

object LegendTitle {
  import scala.scalajs.js.JSConverters._

  /**
    * @param style Generic CSS styles for the legend title.
    * @param text  A text or HTML string for the title.
    */
  def apply(style: Option[String] = None, text: Option[String] = None): LegendTitle = {
    val styleOuter = style.map(stringToStyleObject).orUndefined
    val textOuter = text.orUndefined

    new LegendTitle {
      override val style = styleOuter
      override val text = textOuter
    }
  }
}
