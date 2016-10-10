/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts.config.accessibility

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigation extends js.Object {

  /**
    * Enable keyboard navigation for the chart.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Skip null points when navigating through points with the keyboard.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    */
  val skipNullPoints: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigation {
  import scala.scalajs.js.JSConverters._

  /**
    * @param enabled Enable keyboard navigation for the chart.
    * @param skipNullPoints Skip null points when navigating through points with the keyboard.
    */
  def apply(enabled: Option[Boolean] = None,
            skipNullPoints: Option[Boolean] = None): AccessibilityKeyboardNavigation = {
    val enabledOuter = enabled.orUndefined
    val skipNullPointsOuter = skipNullPoints.orUndefined

    new AccessibilityKeyboardNavigation {
      override val enabled = enabledOuter
      override val skipNullPoints = skipNullPointsOuter
    }
  }
}