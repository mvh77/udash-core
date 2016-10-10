/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package pane

import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class PaneBackground extends js.Object {

  /**
    * The background color or gradient for the pane.
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pane background border color.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel border width of the pane background.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The class name for this background. Defaults to highcharts-pane.
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    */
  val shape: js.UndefOr[String] = js.undefined
}

object PaneBackground {
  import scala.scalajs.js.JSConverters._

  /**
    * @param backgroundColor The background color or gradient for the pane.
    * @param borderColor The pane background border color.
    * @param borderWidth The pixel border width of the pane background.
    * @param className The class name for this background. Defaults to highcharts-pane.
    * @param innerRadius The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    * @param outerRadius The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    * @param shape Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    */
  def apply(backgroundColor: Option[Color] = None,
            borderColor: Option[Color] = None,
            borderWidth: Option[Double] = None,
            className: Option[String] = None,
            innerRadius: Option[Double | String] = None,
            outerRadius: Option[Double | String] = None,
            shape: Option[String] = None): PaneBackground = {
    val backgroundColorOuter = backgroundColor.map(_.c).orUndefined
    val borderColorOuter = borderColor.map(_.c).orUndefined
    val borderWidthOuter = borderWidth.orUndefined
    val classNameOuter = className.orUndefined
    val innerRadiusOuter = innerRadius.orUndefined
    val outerRadiusOuter = outerRadius.orUndefined
    val shapeOuter = shape.orUndefined

    new PaneBackground {
      override val backgroundColor = backgroundColorOuter
      override val borderColor = borderColorOuter
      override val borderWidth = borderWidthOuter
      override val className = classNameOuter
      override val innerRadius = innerRadiusOuter
      override val outerRadius = outerRadiusOuter
      override val shape = shapeOuter
    }
  }
}
