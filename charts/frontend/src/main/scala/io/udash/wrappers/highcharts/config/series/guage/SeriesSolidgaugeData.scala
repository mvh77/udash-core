/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.guage

import io.udash.wrappers.highcharts.config.series.{SeriesDataEvents, SeriesDataLabels}
import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class SeriesSolidgaugeData extends SeriesGaugeData {
  /**
    * The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
    */
  val radius: js.UndefOr[Double | String] = js.undefined
}

object SeriesSolidgaugeData {
  import scala.scalajs.js.JSConverters._

  /**
    * @param color       Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param dataLabels  Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param events      Individual point events
    * @param id          An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param innerRadius The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @param labelRank   The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param name        <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param radius      The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @param selected    Whether the data point is selected initially.
    * @param y           The y value of the point.
    */
  def apply(color: Option[Color] = None,
            dataLabels: Option[SeriesDataLabels] = None,
            description: Option[String] = None,
            events: Option[SeriesDataEvents] = None,
            id: Option[String] = None,
            innerRadius: Option[Double | String] = None,
            labelRank: Option[Double] = None,
            name: Option[String] = None,
            radius: Option[Double | String] = None,
            selected: Option[Boolean] = None,
            y: Option[Double] = None): SeriesSolidgaugeData = {
    val colorOuter = color.map(_.c).orUndefined
    val dataLabelsOuter = dataLabels.orUndefined
    val descriptionOuter = description.orUndefined
    val eventsOuter = events.orUndefined
    val idOuter = id.orUndefined
    val innerRadiusOuter = innerRadius.orUndefined
    val labelrankOuter = labelRank.orUndefined
    val nameOuter = name.orUndefined
    val radiusOuter = radius.orUndefined
    val selectedOuter = selected.orUndefined
    val yOuter = y.orUndefined

    new SeriesSolidgaugeData {
      override val color = colorOuter
      override val dataLabels = dataLabelsOuter
      override val description = descriptionOuter
      override val events = eventsOuter
      override val id = idOuter
      override val innerRadius = innerRadiusOuter
      override val labelrank = labelrankOuter
      override val name = nameOuter
      override val radius = radiusOuter
      override val selected = selectedOuter
      override val y = yOuter
    }
  }
}
