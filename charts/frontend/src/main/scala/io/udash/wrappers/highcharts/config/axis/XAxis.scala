/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package axis

import io.udash.wrappers.highcharts.config.utils._

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction, `|`}

@js.annotation.ScalaJSDefined
class XAxis extends Axis[XAxis, XAxisEvents] {
  /**
    * Applies only when the axis type is category. When nameToX is true, points are placed on the X axis according to their names.
    * If the same point name is repeated in the same or another series, the point is placed on the same X position as other points
    * of the same name. When nameToX is false, the points are laid out in increasing X positions regardless of their names,
    * and the X axis category will take the name of the last point in each position. Defaults to true.
    */
  val nameToX: js.UndefOr[Boolean] = js.undefined
}

object XAxis {
  import scala.scalajs.js.JSConverters._

  /**
    * @param allowDecimals Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals should be avoided in the labels.
    * @param alternateGridColor When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @param breaks An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
    * @param categories <p>If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a <a href="#series.data">name</a> and setting axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple series, best practice remains defining the <code>categories</code> array.</p>. . <p>Example:. <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>. 		 Defaults to <code>null</code>. </p>
    * @param ceiling The highest allowed value for automatically computed axis extremes.
    * @param className A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @param crosshair Configure a crosshair that follows either the mouse pointer or the hovered point.
    * @param dateTimeLabelFormats For a datetime axis, the scale will automatically adjust to the appropriate unit.  This member gives the default string representations used for each unit. For intermediate values, different units may be used, for example the <code>day</code> unit can be used on midnight and <code>hour</code> unit be used for intermediate values on the same axis. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.. . Defaults to:. <pre>{. 	millisecond: '%H:%M:%S.%L',. 	second: '%H:%M:%S',. 	minute: '%H:%M',. 	hour: '%H:%M',. 	day: '%e. %b',. 	week: '%e. %b',. 	month: '%b \'%y',. 	year: '%Y'. }</pre>
    * @param description <p><i>Requires Accessibility module</i></p>. . <p>Description of the axis to screen reader users.</p>
    * @param endOnTick Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
    * @param events Event handlers for the axis.
    * @param floor The lowest allowed value for automatically computed axis extremes.
    * @param gridLineColor Color of the grid lines extending the ticks across the plot area.
    * @param gridLineDashStyle The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param gridLineWidth The width of the grid lines extending the ticks across the plot area.
    * @param gridZIndex The Z index of the grid lines.
    * @param id An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @param labels The axis labels show the number or category for each tick.
    * @param lineColor The color of the line marking the axis itself.
    * @param lineWidth The width of the line marking the axis itself.
    * @param linkedTo Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.</p>. . <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by  <a class="internal" href="#chart">chart.alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param maxPadding Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @param min The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @param minPadding Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> . . <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> . . <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>. . <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @param minTickInterval The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @param minorGridLineColor Color of the minor, secondary grid lines.
    * @param minorGridLineDashStyle The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param minorGridLineWidth Width of the minor, secondary grid lines.
    * @param minorTickColor Color for the minor tick marks.
    * @param minorTickInterval <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, .  the minor tick interval is calculated as a fifth of the tickInterval. If.  <code>null</code>, minor ticks are not shown.</p>.  <p>On logarithmic axes, the unit is the power of the value. For example, setting.  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting.  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, .  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,.  	attempting to enter approximately 5 minor ticks between each major tick.</p>. . <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>. . <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
    * @param minorTickLength The pixel length of the minor tick marks.
    * @param minorTickPosition The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param minorTickWidth The pixel width of the minor tick mark.
    * @param nameToX Applies only when the axis type is category. When nameToX is true, points are placed on the X axis according to their names.
    * @param offset The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly.
    * @param opposite Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
    * @param plotBands <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>. . <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
    * @param plotLines An array of lines stretching across the plot area, marking a specific value on one of the axes.
    * @param reversed Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
    * @param showEmpty Whether to show the axis line and title when the axis has no data.
    * @param showFirstLabel Whether to show the first tick label.
    * @param showLastLabel Whether to show the last tick label.
    * @param softMax A soft maximum for the axis. If the series data maximum is greater than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data.
    * @param softMin A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @param startOfWeek For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @param startOnTick Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
    * @param tickColor Color for the main tick marks.
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval.  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime axes..  On categorized axes, a <code>null</code> tickInterval will default to 1, one category. .  Note that datetime axes are based on milliseconds, so for .  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>.  <p>On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means.  	one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc..  	A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.</p>. . <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>. . <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a> option may interfere with the <code>tickInterval</code> setting.</p>
    * @param tickLength The pixel length of the main tick marks.
    * @param tickPixelInterval If tickInterval is <code>null</code> this option sets the approximate pixel interval of the.  tick marks. Not applicable to categorized axis. Defaults to <code>72</code> .  for the Y axis and <code>100</code> for	the X axis.
    * @param tickPosition The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param tickPositioner A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible through <code>this.tickPositions</code> and can be modified by the callback.
    * @param tickPositions An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
    * @param tickWidth The pixel width of the major tick marks.
    * @param tickmarkPlacement For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
    * @param title The axis title, showing next to the axis line.
    * @param `type` The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code> or <code>category</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series<line>.data.name">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
    * @param units Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:. <pre>units: [[. 	'millisecond', // unit name. 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [. 	'second',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'minute',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'hour',. 	[1, 2, 3, 4, 6, 8, 12]. ], [. 	'day',. 	[1]. ], [. 	'week',. 	[1]. ], [. 	'month',. 	[1, 3, 6]. ], [. 	'year',. 	null. ]]</pre>
    * @param visible Whether axis, including axis title, line, ticks and labels, should be visible.
    */
  def apply(allowDecimals: Option[Boolean] = None, 
            alternateGridColor: Option[Color] = None,
            breaks: Option[Seq[AxisBreak]] = None,
            categories: Option[Seq[String]] = None,
            ceiling: Option[Double] = None,
            className: Option[String] = None,
            crosshair: Option[AxisCrosshair] = None,
            dateTimeLabelFormats: Option[DateTimeLabelFormats] = None,
            description: Option[String] = None,
            endOnTick: Option[Boolean] = None,
            events: Option[XAxisEvents] = None,
            floor: Option[Double] = None,
            gridLineColor: Option[Color] = None,
            gridLineDashStyle: Option[DashStyle] = None,
            gridLineWidth: Option[Double] = None,
            gridZIndex: Option[Int] = None,
            id: Option[String] = None,
            labels: Option[XAxisLabel] = None,
            lineColor: Option[Color] = None,
            lineWidth: Option[Double] = None,
            linkedTo: Option[Int] = None,
            max: Option[Double] = None,
            maxPadding: Option[Double] = None,
            min: Option[Double] = None,
            minPadding: Option[Double] = None,
            minRange: Option[Double] = None,
            minTickInterval: Option[Double] = None,
            minorGridLineColor: Option[Color] = None,
            minorGridLineDashStyle: Option[DashStyle] = None,
            minorGridLineWidth: Option[Double] = None,
            minorTickColor: Option[Color] = None,
            minorTickInterval: Option[String | Double] = None,
            minorTickLength: Option[Double] = None,
            minorTickPosition: Option[InOutPosition] = None,
            minorTickWidth: Option[Double] = None,
            nameToX: Option[Boolean] = None,
            offset: Option[Double] = None,
            opposite: Option[Boolean] = None,
            plotBands: Option[Seq[XAxisPlotBand]] = None,
            plotLines: Option[Seq[AxisPlotLine]] = None,
            reversed: Option[Boolean] = None,
            showEmpty: Option[Boolean] = None,
            showFirstLabel: Option[Boolean] = None,
            showLastLabel: Option[Boolean] = None,
            softMax: Option[Double] = None,
            softMin: Option[Double] = None,
            startOfWeek: Option[DayOfWeek] = None,
            startOnTick: Option[Boolean] = None,
            tickAmount: Option[Int] = None,
            tickColor: Option[Color] = None,
            tickInterval: Option[Double] = None,
            tickLength: Option[Double] = None,
            tickPixelInterval: Option[Double] = None,
            tickPosition: Option[InOutPosition] = None,
            tickPositioner: Option[(Axis.PositionerEvent) => Any] = None,
            tickPositions: Option[Seq[Double]] = None,
            tickWidth: Option[Double] = None,
            tickmarkPlacement: Option[TickmarkPlacement] = None,
            title: Option[AxisTitle] = None,
            `type`: Option[Axis.Type] = None,
            units: Option[Seq[(String, Seq[Int])]] = None,
            visible: Option[Boolean] = None): XAxis = {
    val allowDecimalsOuter = allowDecimals.orUndefined
    val alternateGridColorOuter = alternateGridColor.map(_.c).orUndefined
    val breaksOuter = breaks.map(_.toJSArray).orUndefined
    val categoriesOuter = categories.map(_.toJSArray).orUndefined
    val ceilingOuter = ceiling.orUndefined
    val classNameOuter = className.orUndefined
    val crosshairOuter = crosshair.orUndefined
    val dateTimeLabelFormatsOuter = dateTimeLabelFormats.map(DateTimeLabelFormats.toJSDict).orUndefined
    val descriptionOuter = description.orUndefined
    val endOnTickOuter = endOnTick.orUndefined
    val eventsOuter = events.orUndefined
    val floorOuter = floor.orUndefined
    val gridLineColorOuter = gridLineColor.map(_.c).orUndefined
    val gridLineDashStyleOuter = gridLineDashStyle.map(_.name).orUndefined
    val gridLineWidthOuter = gridLineWidth.orUndefined
    val gridZIndexOuter = gridZIndex.orUndefined
    val idOuter = id.orUndefined
    val labelsOuter = labels.orUndefined
    val lineColorOuter = lineColor.map(_.c).orUndefined
    val lineWidthOuter = lineWidth.orUndefined
    val linkedToOuter = linkedTo.orUndefined
    val maxOuter = max.orUndefined
    val maxPaddingOuter = maxPadding.orUndefined
    val minOuter = min.orUndefined
    val minPaddingOuter = minPadding.orUndefined
    val minRangeOuter = minRange.orUndefined
    val minTickIntervalOuter = minTickInterval.orUndefined
    val minorGridLineColorOuter = minorGridLineColor.map(_.c).orUndefined
    val minorGridLineDashStyleOuter = minorGridLineDashStyle.map(_.name).orUndefined
    val minorGridLineWidthOuter = minorGridLineWidth.orUndefined
    val minorTickColorOuter = minorTickColor.map(_.c).orUndefined
    val minorTickIntervalOuter = minorTickInterval.orUndefined
    val minorTickLengthOuter = minorTickLength.orUndefined
    val minorTickPositionOuter = minorTickPosition.map(_.name).orUndefined
    val minorTickWidthOuter = minorTickWidth.orUndefined
    val nameToXOuter = nameToX.orUndefined
    val offsetOuter = offset.orUndefined
    val oppositeOuter = opposite.orUndefined
    val plotBandsOuter: js.UndefOr[js.Array[AxisPlotBand]] = plotBands.map(_.map(_.asInstanceOf[AxisPlotBand]).toJSArray).orUndefined
    val plotLinesOuter = plotLines.map(_.toJSArray).orUndefined
    val reversedOuter = reversed.orUndefined
    val showEmptyOuter = showEmpty.orUndefined
    val showFirstLabelOuter = showFirstLabel.orUndefined
    val showLastLabelOuter = showLastLabel.orUndefined
    val softMaxOuter = softMax.orUndefined
    val softMinOuter = softMin.orUndefined
    val startOfWeekOuter = startOfWeek.map(_.id).orUndefined
    val startOnTickOuter = startOnTick.orUndefined
    val tickAmountOuter = tickAmount.orUndefined
    val tickColorOuter = tickColor.map(_.c).orUndefined
    val tickIntervalOuter = tickInterval.orUndefined
    val tickLengthOuter = tickLength.orUndefined
    val tickPixelIntervalOuter = tickPixelInterval.orUndefined
    val tickPositionOuter = tickPosition.map(_.name).orUndefined
    val tickPositionerOuter = tickPositioner.map(ThisFunction.fromFunction1[Axis.PositionerEvent, Any]).orUndefined
    val tickPositionsOuter = tickPositions.map(_.toJSArray).orUndefined
    val tickWidthOuter = tickWidth.orUndefined
    val tickmarkPlacementOuter = tickmarkPlacement.map(_.name).orUndefined
    val titleOuter = title.orUndefined
    val typeOuter = `type`.map(_.name).orUndefined
    val unitsOuter = units.map(_.map(t => js.Array[js.Any](t._1, t._2)).toJSArray).orUndefined
    val visibleOuter = visible.orUndefined

    new XAxis {
      override val allowDecimals = allowDecimalsOuter
      override val alternateGridColor = alternateGridColorOuter
      override val breaks = breaksOuter
      override val categories = categoriesOuter
      override val ceiling = ceilingOuter
      override val className = classNameOuter
      override val crosshair = crosshairOuter
      override val dateTimeLabelFormats = dateTimeLabelFormatsOuter
      override val description = descriptionOuter
      override val endOnTick = endOnTickOuter
      override val events = eventsOuter
      override val floor = floorOuter
      override val gridLineColor = gridLineColorOuter
      override val gridLineDashStyle = gridLineDashStyleOuter
      override val gridLineWidth = gridLineWidthOuter
      override val gridZIndex = gridZIndexOuter
      override val id = idOuter
      override val labels = labelsOuter
      override val lineColor = lineColorOuter
      override val lineWidth = lineWidthOuter
      override val linkedTo = linkedToOuter
      override val max = maxOuter
      override val maxPadding = maxPaddingOuter
      override val min = minOuter
      override val minPadding = minPaddingOuter
      override val minRange = minRangeOuter
      override val minTickInterval = minTickIntervalOuter
      override val minorGridLineColor = minorGridLineColorOuter
      override val minorGridLineDashStyle = minorGridLineDashStyleOuter
      override val minorGridLineWidth = minorGridLineWidthOuter
      override val minorTickColor = minorTickColorOuter
      override val minorTickInterval = minorTickIntervalOuter
      override val minorTickLength = minorTickLengthOuter
      override val minorTickPosition = minorTickPositionOuter
      override val minorTickWidth = minorTickWidthOuter
      override val nameToX = nameToXOuter
      override val offset = offsetOuter
      override val opposite = oppositeOuter
      override val plotBands = plotBandsOuter
      override val plotLines = plotLinesOuter
      override val reversed = reversedOuter
      override val showEmpty = showEmptyOuter
      override val showFirstLabel = showFirstLabelOuter
      override val showLastLabel = showLastLabelOuter
      override val softMax = softMaxOuter
      override val softMin = softMinOuter
      override val startOfWeek = startOfWeekOuter
      override val startOnTick = startOnTickOuter
      override val tickAmount = tickAmountOuter
      override val tickColor = tickColorOuter
      override val tickInterval = tickIntervalOuter
      override val tickLength = tickLengthOuter
      override val tickPixelInterval = tickPixelIntervalOuter
      override val tickPosition = tickPositionOuter
      override val tickPositioner = tickPositionerOuter
      override val tickPositions = tickPositionsOuter
      override val tickWidth = tickWidthOuter
      override val tickmarkPlacement = tickmarkPlacementOuter
      override val title = titleOuter
      override val `type` = typeOuter
      override val units = unitsOuter
      override val visible = visibleOuter
    }
  }
}
