/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package labels

import scala.scalajs.js


@js.annotation.ScalaJSDefined
class LabelsItem extends js.Object {

  /**
    * Inner HTML or text for the label.
    */
  val html: js.UndefOr[String] = js.undefined

  /**
    * CSS styles for each label. To position the label, use left and top like this:
    * <pre>style: {
    *   left: '100px',
    *   top: '100px'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object LabelsItem {
  import scala.scalajs.js.JSConverters._

  /**
    * @param html  Inner HTML or text for the label.
    * @param style CSS styles for each label. To position the label, use left and top like this:. <pre>style: {. 	left: '100px',. 	top: '100px'. }</pre>
    */
  def apply(html: Option[String] = None, style: Option[String] = None): LabelsItem = {
    val htmlOuter = html.orUndefined
    val styleOuter = style.map(_.toJSArray).orUndefined

    new LabelsItem {
      override val html = htmlOuter
      override val style = styleOuter
    }
  }
}
