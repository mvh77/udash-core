/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.errorbar

import io.udash.wrappers.highcharts.config.series.{BaseSeriesDataLabels, BaseXSeriesData, SeriesDataEvents}
import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class SeriesErrorbarData extends BaseXSeriesData[BaseSeriesDataLabels] {
  /**
    * The high or maximum value for each data point.
    */
  val high: js.UndefOr[Double] = js.undefined

  /**
    * The low or minimum value for each data point.
    */
  val low: js.UndefOr[Double] = js.undefined
}

object SeriesErrorbarData {
  import scala.scalajs.js.JSConverters._

  /**
    * @param color      Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param events     Individual point events
    * @param high       The high or maximum value for each data point.
    * @param id         An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelRank  The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param low        The low or minimum value for each data point.
    * @param name       <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param selected   Whether the data point is selected initially.
    * @param x          The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  def apply(color: Option[Color] = None,
            events: Option[SeriesDataEvents] = None,
            high: Option[Double] = None,
            id: Option[String] = None,
            labelRank: Option[Double] = None,
            low: Option[Double] = None,
            name: Option[String] = None,
            selected: Option[Boolean] = None,
            x: Option[Double] = None): SeriesErrorbarData = {
    val colorOuter = color.map(_.c).orUndefined
    val eventsOuter = events.orUndefined
    val highOuter: js.UndefOr[Double] = high.orUndefined
    val idOuter = id.orUndefined
    val labelrankOuter = labelRank.orUndefined
    val lowOuter: js.UndefOr[Double] = low.orUndefined
    val nameOuter = name.orUndefined
    val selectedOuter = selected.orUndefined
    val xOuter = x.orUndefined

    new SeriesErrorbarData {
      override val color = colorOuter
      override val events = eventsOuter
      override val high = highOuter
      override val id = idOuter
      override val labelrank = labelrankOuter
      override val low = lowOuter
      override val name = nameOuter
      override val selected = selectedOuter
      override val x = xOuter
    }
  }
}
