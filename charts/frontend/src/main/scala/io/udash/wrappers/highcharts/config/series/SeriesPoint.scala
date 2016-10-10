/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class SeriesPoint extends js.Object {
  /** Events for each single point */
  val events: js.UndefOr[SeriesPointEvents] = js.undefined
}

object SeriesPoint {
  import scala.scalajs.js.JSConverters._

  /**
    * @param events Events for each single point
    */
  def apply(events: Option[SeriesPointEvents] = None): SeriesPoint = {
    val eventsOuter = events.orUndefined
    new SeriesPoint {
      override val events = eventsOuter
    }
  }
}
