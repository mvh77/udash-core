/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package chart

import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js
import scala.scalajs.js.|


@js.annotation.ScalaJSDefined
class ChartOptions3dFrame extends js.Object {
  /**
    * Defines the back panel of the frame around 3D charts.
    */
  val back: js.UndefOr[ChartOptions3dFrame.ChartOptions3dFrameData] = js.undefined

  /**
    * The bottom of the frame around a 3D chart.
    */
  val bottom: js.UndefOr[ChartOptions3dFrame.ChartOptions3dFrameData] = js.undefined

  /**
    * The side for the frame around a 3D chart.
    */
  val side: js.UndefOr[ChartOptions3dFrame.ChartOptions3dFrameData] = js.undefined
}

object ChartOptions3dFrame {
  import scala.scalajs.js.JSConverters._

  @js.annotation.ScalaJSDefined
  class ChartOptions3dFrameData extends js.Object {
    /** The color of the panel. */
    val color: js.UndefOr[String | js.Object] = js.undefined

    /** Thickness of the panel. */
    val size: js.UndefOr[Double] = js.undefined
  }

  object ChartOptions3dFrameData {
    /**
      * @param color The color of the panel.
      * @param size Thickness of the panel.
      */
    def apply(color: Option[Color] = None, size: Option[Double] = None): ChartOptions3dFrameData = {
      val colorOuter = color.map(_.c).orUndefined
      val sizeOuter = size.orUndefined

      new ChartOptions3dFrameData {
        override val color = colorOuter
        override val size = sizeOuter
      }
    }
  }

  /**
    * @param back Defines the back panel of the frame around 3D charts.
    * @param bottom The bottom of the frame around a 3D chart.
    * @param side The side for the frame around a 3D chart.
    */
  def apply(back: Option[ChartOptions3dFrameData] = None,
            bottom: Option[ChartOptions3dFrameData] = None,
            side: Option[ChartOptions3dFrameData] = None): ChartOptions3dFrame = {
    val backOuter = back.orUndefined
    val bottomOuter = bottom.orUndefined
    val sideOuter = side.orUndefined

    new ChartOptions3dFrame {
      override val back = backOuter
      override val bottom = bottomOuter
      override val side = sideOuter
    }
  }
}
