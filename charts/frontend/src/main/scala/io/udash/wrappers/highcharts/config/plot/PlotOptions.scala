/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package plot

import io.udash.wrappers.highcharts.config.series.area.SeriesArea
import io.udash.wrappers.highcharts.config.series.arearange.SeriesArearange
import io.udash.wrappers.highcharts.config.series.areaspline.SeriesAreaspline
import io.udash.wrappers.highcharts.config.series.areasplinerange.SeriesAreasplinerange
import io.udash.wrappers.highcharts.config.series.bar.SeriesBar
import io.udash.wrappers.highcharts.config.series.boxplot.SeriesBoxplot
import io.udash.wrappers.highcharts.config.series.bubble.SeriesBubble
import io.udash.wrappers.highcharts.config.series.column.SeriesColumn
import io.udash.wrappers.highcharts.config.series.columnrnge.SeriesColumnrange
import io.udash.wrappers.highcharts.config.series.errorbar.SeriesErrorbar
import io.udash.wrappers.highcharts.config.series.funnel.SeriesFunnel
import io.udash.wrappers.highcharts.config.series.guage.{SeriesGauge, SeriesSolidgauge}
import io.udash.wrappers.highcharts.config.series.heatmap.SeriesHeatmap
import io.udash.wrappers.highcharts.config.series.line.SeriesLine
import io.udash.wrappers.highcharts.config.series.pie.SeriesPie
import io.udash.wrappers.highcharts.config.series.polygon.SeriesPolygon
import io.udash.wrappers.highcharts.config.series.pyramid.SeriesPyramid
import io.udash.wrappers.highcharts.config.series.scatter.SeriesScatter
import io.udash.wrappers.highcharts.config.series.spline.SeriesSpline
import io.udash.wrappers.highcharts.config.series.treemap.SeriesTreemap
import io.udash.wrappers.highcharts.config.series.waterfall.SeriesWaterfall

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class PlotOptions extends js.Object {
  val area: js.UndefOr[SeriesArea] = js.undefined
  val arearange: js.UndefOr[SeriesArearange] = js.undefined
  val areaspline: js.UndefOr[SeriesAreaspline] = js.undefined
  val areasplinerange: js.UndefOr[SeriesAreasplinerange] = js.undefined
  val bar: js.UndefOr[SeriesBar] = js.undefined
  val boxplot: js.UndefOr[SeriesBoxplot] = js.undefined
  val bubble: js.UndefOr[SeriesBubble] = js.undefined
  val column: js.UndefOr[SeriesColumn] = js.undefined
  val columnrange: js.UndefOr[SeriesColumnrange] = js.undefined
  val errorbar: js.UndefOr[SeriesErrorbar] = js.undefined
  val funnel: js.UndefOr[SeriesFunnel] = js.undefined
  val gauge: js.UndefOr[SeriesGauge] = js.undefined
  val heatmap: js.UndefOr[SeriesHeatmap] = js.undefined
  val line: js.UndefOr[SeriesLine] = js.undefined
  val pie: js.UndefOr[SeriesPie] = js.undefined
  val polygon: js.UndefOr[SeriesPolygon] = js.undefined
  val pyramid: js.UndefOr[SeriesPyramid] = js.undefined
  val scatter: js.UndefOr[SeriesScatter] = js.undefined
  val series: js.UndefOr[SeriesLine] = js.undefined // It looks like lien series: http://api.highcharts.com/highcharts/plotOptions.series
  val solidgauge: js.UndefOr[SeriesSolidgauge] = js.undefined
  val spline: js.UndefOr[SeriesSpline] = js.undefined
  val treemap: js.UndefOr[SeriesTreemap] = js.undefined
  val waterfall: js.UndefOr[SeriesWaterfall] = js.undefined
}

object PlotOptions {
  import scala.scalajs.js.JSConverters._

  /**
    * @param areaRange       The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param areaSplineRange The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param boxPlot         A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
    * @param bubble          A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
    * @param columnRange     The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
    * @param errorbar        Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
    * @param funnel          Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
    * @param gauge           General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
    * @param heatmap         <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>. . <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
    * @param pie             A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
    * @param polygon         A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
    * @param pyramid         A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
    * @param series          <p>General options for all series types.</p>
    * @param solidGauge      A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
    * @param treemap         The size of the point shape is determined by its value relative to its siblings values.. Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
    * @param waterfall       Options for the waterfall series type.
    */
  def apply(area: Option[SeriesArea] = None,
            areaRange: Option[SeriesArearange] = None,
            areaSpline: Option[SeriesAreaspline] = None,
            areaSplineRange: Option[SeriesAreasplinerange] = None,
            bar: Option[SeriesBar] = None,
            boxPlot: Option[SeriesBoxplot] = None,
            bubble: Option[SeriesBubble] = None,
            column: Option[SeriesColumn] = None,
            columnRange: Option[SeriesColumnrange] = None,
            errorbar: Option[SeriesErrorbar] = None,
            funnel: Option[SeriesFunnel] = None,
            gauge: Option[SeriesGauge] = None,
            heatmap: Option[SeriesHeatmap] = None,
            line: Option[SeriesLine] = None,
            pie: Option[SeriesPie] = None,
            polygon: Option[SeriesPolygon] = None,
            pyramid: Option[SeriesPyramid] = None,
            scatter: Option[SeriesScatter] = None,
            series: Option[SeriesLine] = None,
            solidGauge: Option[SeriesSolidgauge] = None,
            spline: Option[SeriesSpline] = None,
            treemap: Option[SeriesTreemap] = None,
            waterfall: Option[SeriesWaterfall] = None): PlotOptions = {
    val areaOuter = area.orUndefined
    val arearangeOuter = areaRange.orUndefined
    val areasplineOuter = areaSpline.orUndefined
    val areasplinerangeOuter = areaSplineRange.orUndefined
    val barOuter = bar.orUndefined
    val boxplotOuter = boxPlot.orUndefined
    val bubbleOuter = bubble.orUndefined
    val columnOuter = column.orUndefined
    val columnrangeOuter = columnRange.orUndefined
    val errorbarOuter = errorbar.orUndefined
    val funnelOuter = funnel.orUndefined
    val gaugeOuter = gauge.orUndefined
    val heatmapOuter = heatmap.orUndefined
    val lineOuter = line.orUndefined
    val pieOuter = pie.orUndefined
    val polygonOuter = polygon.orUndefined
    val pyramidOuter = pyramid.orUndefined
    val scatterOuter = scatter.orUndefined
    val seriesOuter = series.orUndefined
    val solidgaugeOuter = solidGauge.orUndefined
    val splineOuter = spline.orUndefined
    val treemapOuter = treemap.orUndefined
    val waterfallOuter = waterfall.orUndefined

    new PlotOptions {
      override val area = areaOuter
      override val arearange = arearangeOuter
      override val areaspline = areasplineOuter
      override val areasplinerange = areasplinerangeOuter
      override val bar = barOuter
      override val boxplot = boxplotOuter
      override val bubble = bubbleOuter
      override val column = columnOuter
      override val columnrange = columnrangeOuter
      override val errorbar = errorbarOuter
      override val funnel = funnelOuter
      override val gauge = gaugeOuter
      override val heatmap = heatmapOuter
      override val line = lineOuter
      override val pie = pieOuter
      override val polygon = polygonOuter
      override val pyramid = pyramidOuter
      override val scatter = scatterOuter
      override val series = seriesOuter
      override val solidgauge = solidgaugeOuter
      override val spline = splineOuter
      override val treemap = treemapOuter
      override val waterfall = waterfallOuter
    }
  }
}
