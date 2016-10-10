/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package placeholders

import io.udash.wrappers.highcharts.config.utils.Position

import scala.scalajs.js


@js.annotation.ScalaJSDefined
class NoData extends js.Object {

  /**
    * An object of additional SVG attributes for the no-data label.
    */
  val attr: js.UndefOr[js.Object] = js.undefined

  /**
    * The position of the no-data label, relative to the plot area. 
    */
  val position: js.UndefOr[Position] = js.undefined

  /**
    * CSS styles for the no-data label. 
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined
}

object NoData {
  import scala.scalajs.js.JSConverters._

  /**
    * @param attr An object of additional SVG attributes for the no-data label.
    * @param position The position of the no-data label, relative to the plot area. 
    * @param style CSS styles for the no-data label. 
    * @param useHTML Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
    */
  def apply(attr: Option[js.Object] = None,
            position: Option[Position] = None,
            style: Option[String] = None,
            useHTML: Option[Boolean] = None): NoData = {
    val attrOuter = attr.orUndefined
    val positionOuter = position.orUndefined
    val styleOuter = style.map(stringToStyleObject).orUndefined
    val useHTMLOuter = useHTML.orUndefined

    new NoData {
      override val attr = attrOuter
      override val position = positionOuter
      override val style = styleOuter
      override val useHTML = useHTMLOuter
    }
  }
}
