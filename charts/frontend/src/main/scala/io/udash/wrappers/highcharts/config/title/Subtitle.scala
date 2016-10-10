/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package title

import io.udash.wrappers.highcharts.config.utils.{Align, VerticalAlign}

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class Subtitle extends AbstractTitle

object Subtitle {
  import scala.scalajs.js.JSConverters._

  /**
    * @param align The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @param floating When the subtitle is floating, the plot area will not move to make space for it.
    * @param style CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
    * @param text The subtitle of the chart.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    * @param verticalAlign The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @param widthAdjust Adjustment made to the subtitle width, normally to reserve space for the exporting burger menu.
    * @param x The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @param y The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    */
  def apply(align: Option[Align] = None,
            floating: Option[Boolean] = None,
            style: Option[String] = None,
            text: Option[String] = None,
            useHTML: Option[Boolean] = None,
            verticalAlign: Option[VerticalAlign] = None,
            widthAdjust: Option[Double] = None,
            x: Option[Double] = None,
            y: Option[Double] = None): Subtitle = {
    val alignOuter = align.map(_.name).orUndefined
    val floatingOuter = floating.orUndefined
    val styleOuter = style.map(stringToStyleObject).orUndefined
    val textOuter = text.orUndefined
    val useHTMLOuter = useHTML.orUndefined
    val verticalAlignOuter = verticalAlign.map(_.name).orUndefined
    val widthAdjustOuter = widthAdjust.orUndefined
    val xOuter = x.orUndefined
    val yOuter = y.orUndefined

    new Subtitle {
      override val align = alignOuter
      override val floating = floatingOuter
      override val style = styleOuter
      override val text = textOuter
      override val useHTML = useHTMLOuter
      override val verticalAlign = verticalAlignOuter
      override val widthAdjust = widthAdjustOuter
      override val x = xOuter
      override val y = yOuter
    }
  }
}
