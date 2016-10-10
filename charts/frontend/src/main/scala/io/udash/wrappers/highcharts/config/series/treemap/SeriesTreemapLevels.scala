/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.treemap

import io.udash.wrappers.highcharts.config.series.SeriesDataLabels
import io.udash.wrappers.highcharts.config.utils.Color

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class SeriesTreemapLevels extends js.Object {
  /**
    * Can set borderColor on all points which lies on the same level.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Set the dash style of the border of all the point which lies on the level.
    * See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
    */
  val borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * Can set the borderWidth on all points which lies on the same level.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Can set a color on all points which lies on the same level.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Can set the options of dataLabels on each point which lies on the level.
    * <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
    */
  val dataLabels: js.UndefOr[SeriesDataLabels] = js.undefined

  /**
    * Can set the layoutAlgorithm option on a specific level. 
    */
  val layoutAlgorithm: js.UndefOr[String] = js.undefined

  /**
    * Can set the layoutStartingDirection option on a specific level.
    */
  val layoutStartingDirection: js.UndefOr[String] = js.undefined

  /**
    * Decides which level takes effect from the options set in the levels object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/" target="_blank">Styling of both levels</a>
    */
  val level: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapLevels {
  import scala.scalajs.js.JSConverters._

  /**
    * @param borderColor Can set borderColor on all points which lies on the same level.
    * @param borderDashStyle Set the dash style of the border of all the point which lies on the level.. See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
    * @param borderWidth Can set the borderWidth on all points which lies on the same level.
    * @param color Can set a color on all points which lies on the same level.
    * @param dataLabels Can set the options of dataLabels on each point which lies on the level.. <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
    * @param layoutAlgorithm Can set the layoutAlgorithm option on a specific level. 
    * @param layoutStartingDirection Can set the layoutStartingDirection option on a specific level.
    * @param level Decides which level takes effect from the options set in the levels object.
    */
  def apply(borderColor: Option[Color] = None,
            borderDashStyle: Option[String] = None,
            borderWidth: Option[Double] = None,
            color: Option[Color] = None,
            dataLabels: Option[SeriesDataLabels] = None,
            layoutAlgorithm: Option[String] = None,
            layoutStartingDirection: Option[String] = None,
            level: Option[Double] = None): SeriesTreemapLevels = {
    val borderColorOuter = borderColor.map(_.c).orUndefined
    val borderDashStyleOuter = borderDashStyle.orUndefined
    val borderWidthOuter = borderWidth.orUndefined
    val colorOuter = color.map(_.c).orUndefined
    val dataLabelsOuter = dataLabels.orUndefined
    val layoutAlgorithmOuter = layoutAlgorithm.orUndefined
    val layoutStartingDirectionOuter = layoutStartingDirection.orUndefined
    val levelOuter = level.orUndefined

    new SeriesTreemapLevels {
      override val borderColor = borderColorOuter
      override val borderDashStyle = borderDashStyleOuter
      override val borderWidth = borderWidthOuter
      override val color = colorOuter
      override val dataLabels = dataLabelsOuter
      override val layoutAlgorithm = layoutAlgorithmOuter
      override val layoutStartingDirection = layoutStartingDirectionOuter
      override val level = levelOuter
    }
  }
}
