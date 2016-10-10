/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.funnel

import io.udash.wrappers.highcharts.config.series._
import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class SeriesFunnelData extends BaseYSeriesData[SeriesConnectorDataLabels] {
  /**
    * The sequential index of the data point in the legend.
    */
  val legendIndex: js.UndefOr[Int] = js.undefined
}

object SeriesFunnelData {
  import scala.scalajs.js.JSConverters._

  /**
    * @param color       Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param dataLabels  Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drillDown   The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events      Individual point events
    * @param id          An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelRank   The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param legendIndex The sequential index of the data point in the legend.
    * @param name        <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param selected    Whether the data point is selected initially.
    * @param y           The y value of the point.
    */
  def apply(color: Option[Color] = None,
            dataLabels: Option[SeriesConnectorDataLabels] = None,
            description: Option[String] = None,
            drillDown: Option[String] = None,
            events: Option[SeriesDataEvents] = None,
            id: Option[String] = None,
            labelRank: Option[Double] = None,
            legendIndex: Option[Int] = None,
            name: Option[String] = None,
            selected: Option[Boolean] = None,
            y: Option[Double] = None): SeriesFunnelData = {
    val colorOuter = color.map(_.c).orUndefined
    val dataLabelsOuter = dataLabels.orUndefined
    val descriptionOuter = description.orUndefined
    val drilldownOuter = drillDown.orUndefined
    val eventsOuter = events.orUndefined
    val idOuter = id.orUndefined
    val labelrankOuter = labelRank.orUndefined
    val legendIndexOuter = legendIndex.orUndefined
    val nameOuter = name.orUndefined
    val selectedOuter = selected.orUndefined
    val yOuter = y.orUndefined

    new SeriesFunnelData {
      override val color = colorOuter
      override val dataLabels = dataLabelsOuter
      override val description = descriptionOuter
      override val drilldown = drilldownOuter
      override val events = eventsOuter
      override val id = idOuter
      override val labelrank = labelrankOuter
      override val legendIndex = legendIndexOuter
      override val name = nameOuter
      override val selected = selectedOuter
      override val y = yOuter
    }
  }
}
