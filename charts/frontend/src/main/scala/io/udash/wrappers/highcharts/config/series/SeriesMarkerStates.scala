/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class BaseSeriesMarkerStates[Hover <: BaseSeriesMarkerHover] extends js.Object {
  val hover: js.UndefOr[Hover] = js.undefined
}

@js.annotation.ScalaJSDefined
class SeriesMarkerStates extends BaseSeriesMarkerStates[SeriesMarkerHover] {
  val select: js.UndefOr[SeriesMarkerSelect] = js.undefined
}

@js.annotation.ScalaJSDefined
class SeriesDataMarkerStates extends BaseSeriesMarkerStates[SeriesDataMarkerHover]

object SeriesMarkerStates {
  import scala.scalajs.js.JSConverters._

  def apply(hover: Option[SeriesMarkerHover] = None, select: Option[SeriesMarkerSelect] = None): SeriesMarkerStates = {
    val hoverOuter = hover.orUndefined
    val selectOuter = select.orUndefined
    new SeriesMarkerStates {
      override val hover = hoverOuter
      override val select = selectOuter
    }
  }
}

object SeriesDataMarkerStates {
  import scala.scalajs.js.JSConverters._

  def apply(hover: Option[SeriesDataMarkerHover] = None): SeriesDataMarkerStates = {
    val hoverOuter = hover.orUndefined
    new SeriesDataMarkerStates {
      override val hover = hoverOuter
    }
  }
}
