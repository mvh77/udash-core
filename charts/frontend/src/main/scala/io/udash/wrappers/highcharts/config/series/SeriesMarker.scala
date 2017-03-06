/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series

import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class BaseSeriesMarker[States <: BaseSeriesMarkerStates[_]] extends js.Object {

  /**
    * Enable or disable the point marker. If <code>null</code>, the markers are hidden when the data is dense,
    * and shown for more widespread data points.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/" target="_blank">Disabled markers</a>,
    *          <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/" target="_blank">disabled in normal state but enabled on hover</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">White fill</a>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">Inherit from series color (null)</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the point marker's outline.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">2px blue marker</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-radius/" target="_blank">Bigger markers</a>
    */
  val radius: js.UndefOr[Double] = js.undefined

  val states: js.UndefOr[States] = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols.
    * Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>
    *
    * <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image
    * to be applied to exported charts, its URL needs to be accessible by the export server.</p>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/" target="_blank">Predefined, graphic and custom markers</a>
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    */
  val width: js.UndefOr[Double] = js.undefined
}

@js.annotation.ScalaJSDefined
class SeriesMarker extends BaseSeriesMarker[SeriesMarkerStates]

@js.annotation.ScalaJSDefined
class SeriesDataMarker extends BaseSeriesMarker[SeriesDataMarkerStates]

object SeriesMarker {
  import scala.scalajs.js.JSConverters._

  sealed abstract class Symbol(val value: String)
  object Symbol {
    case object Circle extends Symbol("circle")
    case object Square extends Symbol("square")
    case object Diamond extends Symbol("diamond")
    case object Triangle extends Symbol("triangle")
    case object TriangleDown extends Symbol("triangle-down")
    case class Url(url: String) extends Symbol(s"url($url)")
  }

  /**
    * @param enabled   Enable or disable the point marker. If <code>null</code>, the markers are hidden when the data is dense, and shown for more widespread data points.
    * @param fillColor The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    * @param height    Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param radius    The radius of the point marker.
    * @param symbol    <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>. . <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>. . <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
    * @param width     Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    */
  def apply(enabled: Option[Boolean] = None,
            fillColor: Option[Color] = None,
            height: Option[Double] = None,
            lineColor: Option[Color] = None,
            lineWidth: Option[Double] = None,
            radius: Option[Double] = None,
            states: Option[SeriesMarkerStates] = None,
            symbol: Option[Symbol] = None,
            width: Option[Double] = None): SeriesMarker = {
    val enabledOuter = enabled.orUndefined
    val fillColorOuter = fillColor.map(_.c).orUndefined
    val heightOuter = height.orUndefined
    val lineColorOuter = lineColor.map(_.c).orUndefined
    val lineWidthOuter = lineWidth.orUndefined
    val radiusOuter = radius.orUndefined
    val statesOuter = states.orUndefined
    val symbolOuter = symbol.map(_.value).orUndefined
    val widthOuter = width.orUndefined

    new SeriesMarker {
      override val enabled = enabledOuter
      override val fillColor = fillColorOuter
      override val height = heightOuter
      override val lineColor = lineColorOuter
      override val lineWidth = lineWidthOuter
      override val radius = radiusOuter
      override val states = statesOuter
      override val symbol = symbolOuter
      override val width = widthOuter
    }
  }
}

object SeriesDataMarker {
  import scala.scalajs.js.JSConverters._

  /**
    * @param enabled   Enable or disable the point marker. If <code>null</code>, the markers are hidden when the data is dense, and shown for more widespread data points.
    * @param fillColor The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    * @param height    Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param radius    The radius of the point marker.
    * @param symbol    <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>. . <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>. . <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
    * @param width     Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    */
  def apply(enabled: Option[Boolean] = None,
            fillColor: Option[Color] = None,
            height: Option[Double] = None,
            lineColor: Option[Color] = None,
            lineWidth: Option[Double] = None,
            radius: Option[Double] = None,
            states: Option[SeriesDataMarkerStates] = None,
            symbol: Option[SeriesMarker.Symbol] = None,
            width: Option[Double] = None): SeriesDataMarker = {
    val enabledOuter = enabled.orUndefined
    val fillColorOuter = fillColor.map(_.c).orUndefined
    val heightOuter = height.orUndefined
    val lineColorOuter = lineColor.map(_.c).orUndefined
    val lineWidthOuter = lineWidth.orUndefined
    val radiusOuter = radius.orUndefined
    val statesOuter = states.orUndefined
    val symbolOuter = symbol.map(_.value).orUndefined
    val widthOuter = width.orUndefined

    new SeriesDataMarker {
      override val enabled = enabledOuter
      override val fillColor = fillColorOuter
      override val height = heightOuter
      override val lineColor = lineColorOuter
      override val lineWidth = lineWidthOuter
      override val radius = radiusOuter
      override val states = statesOuter
      override val symbol = symbolOuter
      override val width = widthOuter
    }
  }
}
