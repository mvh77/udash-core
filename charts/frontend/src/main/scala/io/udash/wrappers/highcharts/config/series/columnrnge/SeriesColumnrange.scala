/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.columnrnge

import io.udash.wrappers.highcharts.config.series._
import io.udash.wrappers.highcharts.config.utils._

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class SeriesColumnrange extends BarSeries {
  override type Data = js.Array[SeriesColumnrangeData | js.Array[String | Double]]
  override type DataLabels = SeriesRangeDataLabels
  override type States = SeriesBarStates
  override val `type`: String = "columnrange"

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
    * or two dimensional arrays with x and y values are allowed. Also, only the first
    * point is tested, and the rest are assumed to be the same format. This saves expensive
    * data checking and indexing in long series. Set it to <code>0</code> disable.
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined
}

object SeriesColumnrange {
  import scala.scalajs.js.JSConverters._

  /**
    * @param allowPointSelect    Allow this series' points to be selected by clicking on the markers, bars or pie slices.
    * @param animation           <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param animationLimit      For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param borderColor         The color of the border surrounding each column or bar.
    * @param borderRadius        The corner radius of the border surrounding each column or bar.
    * @param borderWidth         The width of the border surrounding each column or bar.
    * @param className           A class name to apply to the series' graphical elements.
    * @param color               The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    * @param colorByPoint        When using automatic point colors pulled from the <code>options.colors</code>.  collection, this option determines whether the chart should receive .  one color per series or one color per point.
    * @param colors              A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
    * @param cropThreshold       When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    * @param cursor              You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param data                An array of data points for the series. For the <code>columnrange</code> series type, points can be given in the following ways:.  <ol>.  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is.  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> .  	and <code>pointInterval</code> given in the series options.</p>. <pre>data: [.     [0, 4, 2], .     [1, 2, 1], .     [2, 9, 10]. ]</pre></li>. . . <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<columnrange>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     low: 0,.     high: 4,.     name: "Point2",.     color: "#00FF00". }, {.     x: 1,.     low: 5,.     high: 3,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param dataLabels          Extended data labels for range series types. Range series  data labels have no <code>x</code> and <code>y</code> options. Instead, they have <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower data label sets individually.
    * @param depth               Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
    * @param edgeColor           3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
    * @param edgeWidth           3D columns only. The width of the colored edges.
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param getExtremesFromAll  Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param groupPadding        Padding between each value groups, in x axis units.
    * @param groupZPadding       The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
    * @param grouping            Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other.
    * @param id                  An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index               The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param keys                An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex         The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param linkedTo            The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param maxPointWidth       The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
    * @param minPointLength      The minimal height for a column or width for a bar. By default, 0 values are not shown. To visualize a 0 (or close to zero) point, set the minimal point length to a  pixel value like 3. In stacked column charts, minPointLength might not be respected for tightly packed values.
    * @param name                The name of the series as shown in the legend, tooltip etc.
    * @param point               Properties for each single point
    * @param pointInterval       <p>If no x values are given for the points in a series, pointInterval defines.  the interval of the x values. For example, if a series contains one value.  every decade starting from year 0, set pointInterval to 10.</p>. <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @param pointIntervalUnit   On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to irregular time units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours, but pointIntervalUnit also takes the DST crossover into consideration when dealing with local time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.
    * @param pointPadding        Padding between each column or bar, in x axis units.
    * @param pointPlacement      <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>. <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>. <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @param pointRange          The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
    * @param pointStart          If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
    * @param pointWidth          A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
    * @param selected            Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param shadow              Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox        If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend        Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param states              A wrapper object for all the series options in specific states.
    * @param stickyTracking      Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
    * @param tooltip             A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param turboThreshold      When a series contains a data array that is longer than this, only one dimensional arrays of numbers,.  or two dimensional arrays with x and y values are allowed. Also, only the first.  point is tested, and the rest are assumed to be the same format. This saves expensive.  data checking and indexing in long series. Set it to <code>0</code> disable.
    * @param visible             Set the initial visibility of the series.
    * @param xAxis               When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    * @param yAxis               When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @param zIndex              Define the visual z index of the series.
    * @param zoneAxis            Defines the Axis on which the zones are applied.
    * @param zones               An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    */
  def apply(allowPointSelect: Option[Boolean] = None,
            animation: Option[Animation] = None,
            animationLimit: Option[Double] = None,
            borderColor: Option[Color] = None,
            borderRadius: Option[Double] = None,
            borderWidth: Option[Double] = None,
            className: Option[String] = None,
            color: Option[Color] = None,
            colorByPoint: Option[Boolean] = None,
            colors: Option[Seq[Color]] = None,
            cropThreshold: Option[Double] = None,
            cursor: Option[String] = None,
            data: Seq[SeriesColumnrangeData] = Seq.empty,
            dataLabels: Option[SeriesRangeDataLabels] = None,
            description: Option[String] = None,
            depth: Option[Double] = None,
            edgeColor: Option[Color] = None,
            edgeWidth: Option[Double] = None,
            enableMouseTracking: Option[Boolean] = None,
            events: Option[SeriesEvents] = None,
            getExtremesFromAll: Option[Boolean] = None,
            groupPadding: Option[Double] = None,
            groupZPadding: Option[Double] = None,
            grouping: Option[Boolean] = None,
            id: Option[String] = None,
            index: Option[Double] = None,
            keys: Option[Seq[String]] = None,
            legendIndex: Option[Double] = None,
            linkedTo: Option[String] = None,
            maxPointWidth: Option[Double] = None,
            minPointLength: Option[Double] = None,
            name: Option[String] = None,
            point: Option[SeriesPoint] = None,
            pointInterval: Option[Double] = None,
            pointIntervalUnit: Option[PointIntervalUnit] = None,
            pointPadding: Option[Double] = None,
            pointPlacement: Option[PointPlacement] = None,
            pointRange: Option[Double] = None,
            pointStart: Option[Double] = None,
            pointWidth: Option[Double] = None,
            selected: Option[Boolean] = None,
            shadow: Option[Shadow] = None,
            showCheckbox: Option[Boolean] = None,
            showInLegend: Option[Boolean] = None,
            states: Option[SeriesBarStates] = None,
            stickyTracking: Option[Boolean] = None,
            tooltip: Option[SeriesTooltip] = None,
            turboThreshold: Option[Double] = None,
            visible: Option[Boolean] = None,
            xAxis: Option[Int | String] = None,
            yAxis: Option[Int | String] = None,
            zIndex: Option[Int] = None,
            zoneAxis: Option[String] = None,
            zones: Option[Seq[SeriesZone]] = None): SeriesColumnrange = {
    val allowPointSelectOuter = allowPointSelect.orUndefined
    val animationOuter = animation.map(_.value).orUndefined
    val animationLimitOuter = animationLimit.orUndefined
    val borderColorOuter = borderColor.map(_.c).orUndefined
    val borderRadiusOuter = borderRadius.orUndefined
    val borderWidthOuter = borderWidth.orUndefined
    val classNameOuter = className.orUndefined
    val colorOuter = color.map(_.c).orUndefined
    val colorByPointOuter = colorByPoint.orUndefined
    val colorsOuter = colors.map(_.map(_.c).toJSArray).orUndefined
    val cropThresholdOuter = cropThreshold.orUndefined
    val cursorOuter = cursor.orUndefined
    val dataOuter = data.toJSArray.asInstanceOf[js.UndefOr[SeriesColumnrange#Data]]
    val dataLabelsOuter = dataLabels.orUndefined
    val descriptionOuter = description.orUndefined
    val depthOuter = depth.orUndefined
    val edgeColorOuter = edgeColor.map(_.c).orUndefined
    val edgeWidthOuter = edgeWidth.orUndefined
    val enableMouseTrackingOuter = enableMouseTracking.orUndefined
    val eventsOuter = events.orUndefined
    val getExtremesFromAllOuter = getExtremesFromAll.orUndefined
    val groupPaddingOuter = groupPadding.orUndefined
    val groupZPaddingOuter = groupZPadding.orUndefined
    val groupingOuter = grouping.orUndefined
    val idOuter = id.orUndefined
    val indexOuter = index.orUndefined
    val keysOuter = keys.map(_.toJSArray).orUndefined
    val legendIndexOuter = legendIndex.orUndefined
    val linkedToOuter = linkedTo.orUndefined
    val maxPointWidthOuter = maxPointWidth.orUndefined
    val minPointLengthOuter = minPointLength.orUndefined
    val nameOuter = name.orUndefined
    val pointOuter = point.orUndefined
    val pointIntervalOuter = pointInterval.orUndefined
    val pointIntervalUnitOuter = pointIntervalUnit.map(_.name).orUndefined
    val pointPaddingOuter = pointPadding.orUndefined
    val pointPlacementOuter = pointPlacement.map(_.name).orUndefined
    val pointRangeOuter = pointRange.orUndefined
    val pointStartOuter = pointStart.orUndefined
    val pointWidthOuter = pointWidth.orUndefined
    val selectedOuter = selected.orUndefined
    val shadowOuter = shadow.map(_.value).orUndefined
    val showCheckboxOuter = showCheckbox.orUndefined
    val showInLegendOuter = showInLegend.orUndefined
    val statesOuter = states.orUndefined
    val stickyTrackingOuter = stickyTracking.orUndefined
    val tooltipOuter = tooltip.orUndefined
    val turboThresholdOuter = turboThreshold.orUndefined
    val visibleOuter = visible.orUndefined
    val xAxisOuter = xAxis.orUndefined
    val yAxisOuter = yAxis.orUndefined
    val zIndexOuter = zIndex.orUndefined
    val zoneAxisOuter = zoneAxis.orUndefined
    val zonesOuter = zones.map(_.toJSArray).orUndefined

    new SeriesColumnrange {
      override val allowPointSelect = allowPointSelectOuter
      override val animation = animationOuter
      override val animationLimit = animationLimitOuter
      override val borderColor = borderColorOuter
      override val borderRadius = borderRadiusOuter
      override val borderWidth = borderWidthOuter
      override val className = classNameOuter
      override val color = colorOuter
      override val colorByPoint = colorByPointOuter
      override val colors = colorsOuter
      override val cropThreshold = cropThresholdOuter
      override val cursor = cursorOuter
      override val data = dataOuter
      override val dataLabels = dataLabelsOuter
      override val description = descriptionOuter
      override val depth = depthOuter
      override val edgeColor = edgeColorOuter
      override val edgeWidth = edgeWidthOuter
      override val enableMouseTracking = enableMouseTrackingOuter
      override val events = eventsOuter
      override val getExtremesFromAll = getExtremesFromAllOuter
      override val groupPadding = groupPaddingOuter
      override val groupZPadding = groupZPaddingOuter
      override val grouping = groupingOuter
      override val id = idOuter
      override val index = indexOuter
      override val keys = keysOuter
      override val legendIndex = legendIndexOuter
      override val linkedTo = linkedToOuter
      override val maxPointWidth = maxPointWidthOuter
      override val minPointLength = minPointLengthOuter
      override val name = nameOuter
      override val point = pointOuter
      override val pointInterval = pointIntervalOuter
      override val pointIntervalUnit = pointIntervalUnitOuter
      override val pointPadding = pointPaddingOuter
      override val pointPlacement = pointPlacementOuter
      override val pointRange = pointRangeOuter
      override val pointStart = pointStartOuter
      override val pointWidth = pointWidthOuter
      override val selected = selectedOuter
      override val shadow = shadowOuter
      override val showCheckbox = showCheckboxOuter
      override val showInLegend = showInLegendOuter
      override val states = statesOuter
      override val stickyTracking = stickyTrackingOuter
      override val tooltip = tooltipOuter
      override val turboThreshold = turboThresholdOuter
      override val visible = visibleOuter
      override val xAxis = xAxisOuter
      override val yAxis = yAxisOuter
      override val zIndex = zIndexOuter
      override val zoneAxis = zoneAxisOuter
      override val zones = zonesOuter
    }
  }
}
