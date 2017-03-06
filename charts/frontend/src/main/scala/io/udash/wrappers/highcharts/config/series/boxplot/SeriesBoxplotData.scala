/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.boxplot

import io.udash.wrappers.highcharts.config.series.{BaseSeriesDataLabels, BaseTwoDimSeriesData, SeriesDataEvents, SeriesDataLabels}
import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class SeriesBoxplotData extends BaseTwoDimSeriesData[BaseSeriesDataLabels] {
  /**
    * The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
    */
  val high: js.UndefOr[Double] = js.undefined

  /**
    * The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
    */
  val low: js.UndefOr[Double] = js.undefined

  /**
    * The median for each data point. This is drawn as a line through the middle area of the box.
    */
  val median: js.UndefOr[Double] = js.undefined

  /**
    * The lower quartile for each data point. This is the bottom of the box.
    */
  val q1: js.UndefOr[Double] = js.undefined

  /**
    * The higher quartile for each data point. This is the top of the box.
    */
  val q3: js.UndefOr[Double] = js.undefined
}

object SeriesBoxplotData {
  import scala.scalajs.js.JSConverters._

  /**
    * @param color      Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drillDown  The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events     Individual point events
    * @param high       The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
    * @param id         An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelRank  The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param low        The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
    * @param median     The median for each data point. This is drawn as a line through the middle area of the box.
    * @param name       <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param q1         The lower quartile for each data point. This is the bottom of the box.
    * @param q3         The higher quartile for each data point. This is the top of the box.
    * @param selected   Whether the data point is selected initially.
    * @param x          The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    * @param y          The y value of the point.
    */
  def apply(color: Option[Color] = None,
            dataLabels: Option[SeriesDataLabels] = None,
            description: Option[String] = None,
            drillDown: Option[String] = None,
            events: Option[SeriesDataEvents] = None,
            high: Option[Double] = None,
            id: Option[String] = None,
            labelRank: Option[Double] = None,
            low: Option[Double] = None,
            median: Option[Double] = None,
            name: Option[String] = None,
            q1: Option[Double] = None,
            q3: Option[Double] = None,
            selected: Option[Boolean] = None,
            x: Option[Double] = None,
            y: Option[Double] = None): SeriesBoxplotData = {

    val colorOuter = color.map(_.c).orUndefined
    val dataLabelsOuter = dataLabels.orUndefined
    val descriptionOuter = description.orUndefined
    val drilldownOuter = drillDown.orUndefined
    val eventsOuter = events.orUndefined
    val highOuter = high.orUndefined
    val idOuter = id.orUndefined
    val labelrankOuter = labelRank.orUndefined
    val lowOuter = low.orUndefined
    val medianOuter = median.orUndefined
    val nameOuter = name.orUndefined
    val q1Outer = q1.orUndefined
    val q3Outer = q3.orUndefined
    val selectedOuter = selected.orUndefined
    val xOuter = x.orUndefined
    val yOuter = y.orUndefined

    new SeriesBoxplotData {
      override val color = colorOuter
      override val dataLabels = dataLabelsOuter
      override val description = descriptionOuter
      override val drilldown = drilldownOuter
      override val events = eventsOuter
      override val high = highOuter
      override val id = idOuter
      override val labelrank = labelrankOuter
      override val low = lowOuter
      override val median = medianOuter
      override val name = nameOuter
      override val q1 = q1Outer
      override val q3 = q3Outer
      override val selected = selectedOuter
      override val x = xOuter
      override val y = yOuter
    }
  }
}
