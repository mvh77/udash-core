/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class SeriesStates[Hover <: SeriesStatesHover] extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[Hover] = js.undefined
}

@js.annotation.ScalaJSDefined
class SeriesAreaStates extends SeriesStates[SeriesAreaStatesHover]

@js.annotation.ScalaJSDefined
class SeriesBarStates extends SeriesStates[SeriesBarStatesHover]

object SeriesAreaStates {
  import scala.scalajs.js.JSConverters._

  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: Option[SeriesAreaStatesHover] = None): SeriesAreaStates = {
    val hoverOuter = hover.orUndefined
    new SeriesAreaStates {
      override val hover: js.UndefOr[SeriesAreaStatesHover] = hoverOuter
    }
  }
}

object SeriesBarStates {
  import scala.scalajs.js.JSConverters._

  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: Option[SeriesBarStatesHover] = None): SeriesBarStates = {
    val hoverOuter = hover.orUndefined
    new SeriesBarStates {
      override val hover: js.UndefOr[SeriesBarStatesHover] = hoverOuter
    }
  }
}
