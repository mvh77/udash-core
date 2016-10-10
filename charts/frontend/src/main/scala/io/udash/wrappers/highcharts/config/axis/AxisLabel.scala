/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package axis

import io.udash.wrappers.highcharts.config.chart.Chart
import io.udash.wrappers.highcharts.config.utils.Align

import scala.scalajs.js
import scala.scalajs.js.ThisFunction

@js.annotation.ScalaJSDefined
class AxisLabel[AxisType <: BaseAxis[AxisType, _]] extends js.Object {
  /**
    * What part of the string the given position is anchored to. Can be one of <code>"left"</code>,
    * <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the
    * chart the axis is on and the rotation of the label.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-left/" target="_blank">"left"</a>,
    *          <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-right/" target="_blank">"right"</a> on X axis
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels.
    * If there is enough space, labels are not rotated. As the chart gets narrower,
    * it will start rotating the labels -45 degrees, then remove every second label
    * and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation,
    * which will cause the labels to word-wrap if possible.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/" target="_blank">Default auto rotation of 0 or -45</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/" target="_blank">custom graded auto rotation</a>
    */
  val autoRotation: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * When each category width is more than this many pixels, we don't apply auto rotation.
    * Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label
    * contains multiple short words that don't extend the available horizontal space for each label.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/" target="_blank">Lower limit</a>
    */
  val autoRotationLimit: js.UndefOr[Double] = js.undefined

  /**
    * Polar charts only. The label's pixel distance from the perimeter of the plot area.
    */
  val distance: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the axis labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-enabled/" target="_blank">X axis labels disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-format/" target="_blank">Add units to Y axis label</a>
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * Callback JavaScript function to format the label. The value is
    *  given by <code>this.value</code>. Additional properties for <code>this</code> are
    *  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>.
    *  Defaults to:
    * <pre>function() {
    * 	return this.value;
    * }</pre>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-linked/" target="_blank">Linked category names</a>
    */
  val formatter: js.UndefOr[js.ThisFunction0[AxisLabel.FormatterData[AxisType], Any]] = js.undefined

  /**
    * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code>
    * defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
    */
  @deprecated("Deprecated in native HighCharts library.", "0.5.0")
  val maxStaggerLines: js.UndefOr[Double] = js.undefined

  /**
    * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>.
    * By default it aligns inside the chart area. If "justify", labels will not render outside the plot area.
    * If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    */
  @deprecated("Deprecated in native HighCharts library.", "0.5.0")
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * The pixel padding for axis labels, to ensure white space between them.
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace/" target="_blank">No reserved space, labels inside plot</a>.
    */
  val reserveSpace: js.UndefOr[Boolean] = js.undefined

  /**
    * Rotation of the labels in degrees.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-rotation/" target="_blank">X axis labels rotated 90°</a>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-staggerlines/" target="_blank">Show labels over two lines</a>
    */
  val staggerLines: js.UndefOr[Double] = js.undefined

  /**
    * <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>.
    * Setting the step to 2 shows every other label.</p>
    *
    * <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1.
    * This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type.
    * Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step/" target="_blank">Showing only every other axis label on a categorized x axis</a>. <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step-auto/" target="_blank">Auto steps on a category axis</a>.
    */
  val step: js.UndefOr[Int] = js.undefined

  /**
    * CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-style/" target="_blank">Red X axis labels</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The x position offset of the label relative to the tick position on the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * The Z index for the axis labels.
    */
  val zIndex: js.UndefOr[Int] = js.undefined
}

object AxisLabel {
  @js.native
  trait FormatterData[AxisType <: BaseAxis[AxisType, _]] extends js.Object {
    def value: js.Any
    def axis: AxisType
    def chart: Chart
    def isFirst: Boolean
    def isLast: Boolean
  }
}

trait AxisLabelCompanion[AxisType <: BaseAxis[AxisType, _], AxisLabelsType <: AxisLabel[AxisType]] {
  import scala.scalajs.js.JSConverters._

  protected def _apply(align: Option[Align] = None,
                       autoRotation: Option[Seq[Double]] = None,
                       autoRotationLimit: Option[Double] = None,
                       distance: Option[Double] = None,
                       enabled: Option[Boolean] = None,
                       format: Option[String] = None,
                       formatter: Option[(AxisLabel.FormatterData[AxisType]) => Any] = None,
                       maxStaggerLines: Option[Double] = None,
                       overflow: Option[String] = None,
                       padding: Option[Double] = None,
                       reserveSpace: Option[Boolean] = None,
                       rotation: Option[Double] = None,
                       staggerLines: Option[Double] = None,
                       step: Option[Int] = None,
                       style: Option[String] = None,
                       useHTML: Option[Boolean] = None,
                       x: Option[Double] = None,
                       y: Option[Double] = None,
                       zIndex: Option[Int] = None): AxisLabelsType = {
    val alignOuter = align.map(_.name).orUndefined
    val autoRotationOuter = autoRotation.map(_.toJSArray).orUndefined
    val autoRotationLimitOuter = autoRotationLimit.orUndefined
    val distanceOuter = distance.orUndefined
    val enabledOuter = enabled.orUndefined
    val formatOuter = format.orUndefined
    val formatterOuter = formatter.map(ThisFunction.fromFunction1[AxisLabel.FormatterData[AxisType], Any]).orUndefined
    val maxStaggerLinesOuter = maxStaggerLines.orUndefined
    val overflowOuter = overflow.orUndefined
    val paddingOuter = padding.orUndefined
    val reserveSpaceOuter = reserveSpace.orUndefined
    val rotationOuter = rotation.orUndefined
    val staggerLinesOuter = staggerLines.orUndefined
    val stepOuter = step.orUndefined
    val styleOuter = style.map(stringToStyleObject).orUndefined
    val useHTMLOuter = useHTML.orUndefined
    val xOuter = x.orUndefined
    val yOuter = y.orUndefined
    val zIndexOuter = zIndex.orUndefined

    new AxisLabel[AxisType] {
      override val align = alignOuter
      override val autoRotation = autoRotationOuter
      override val autoRotationLimit = autoRotationLimitOuter
      override val distance = distanceOuter
      override val enabled = enabledOuter
      override val format = formatOuter
      override val formatter = formatterOuter
      override val maxStaggerLines = maxStaggerLinesOuter
      override val overflow = overflowOuter
      override val padding = paddingOuter
      override val reserveSpace = reserveSpaceOuter
      override val rotation = rotationOuter
      override val staggerLines = staggerLinesOuter
      override val step = stepOuter
      override val style = styleOuter
      override val useHTML = useHTMLOuter
      override val x = xOuter
      override val y = yOuter
      override val zIndex = zIndexOuter
    }.asInstanceOf[AxisLabelsType]
  }
}

@js.annotation.ScalaJSDefined
class XAxisLabel extends AxisLabel[XAxis]
object XAxisLabel extends AxisLabelCompanion[XAxis, XAxisLabel] {
  /**
    * @param align What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @param autoRotation For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
    * @param autoRotationLimit When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
    * @param distance Polar charts only. The label's pixel distance from the perimeter of the plot area.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
    * @param formatter Callback JavaScript function to format the label. The value is .  given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>..  Defaults to: . <pre>function() {. 	return this.value;. }</pre>
    * @param maxStaggerLines Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param padding The pixel padding for axis labels, to ensure white space between them.
    * @param reserveSpace Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>. . <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
    * @param style CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: Option[Align] = None,
            autoRotation: Option[Seq[Double]] = None,
            autoRotationLimit: Option[Double] = None,
            distance: Option[Double] = None,
            enabled: Option[Boolean] = None,
            format: Option[String] = None,
            formatter: Option[(AxisLabel.FormatterData[XAxis]) => Any] = None,
            maxStaggerLines: Option[Double] = None,
            overflow: Option[String] = None,
            padding: Option[Double] = None,
            reserveSpace: Option[Boolean] = None,
            rotation: Option[Double] = None,
            staggerLines: Option[Double] = None,
            step: Option[Int] = None,
            style: Option[String] = None,
            useHTML: Option[Boolean] = None,
            x: Option[Double] = None,
            y: Option[Double] = None,
            zIndex: Option[Int] = None): XAxisLabel =
    _apply(
      align, autoRotation, autoRotationLimit, distance, enabled, format, formatter, maxStaggerLines, overflow,
      padding, reserveSpace, rotation, staggerLines, step, style, useHTML, x, y, zIndex
    )
}

@js.annotation.ScalaJSDefined
class YAxisLabel extends AxisLabel[YAxis]
object YAxisLabel extends AxisLabelCompanion[YAxis, YAxisLabel] {
  /**
    * @param align What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @param autoRotationLimit When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
    * @param distance Polar charts only. The label's pixel distance from the perimeter of the plot area.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
    * @param formatter Callback JavaScript function to format the label. The value is .  given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>..  Defaults to: . <pre>function() {. 	return this.value;. }</pre>
    * @param padding The pixel padding for axis labels, to ensure white space between them.
    * @param reserveSpace Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @param rotation Rotation of the labels in degrees.
    * @param step <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>. . <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
    * @param style CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: Option[Align] = None,
            autoRotationLimit: Option[Double] = None,
            distance: Option[Double] = None,
            enabled: Option[Boolean] = None,
            format: Option[String] = None,
            formatter: Option[(AxisLabel.FormatterData[YAxis]) => Any] = None,
            padding: Option[Double] = None,
            reserveSpace: Option[Boolean] = None,
            rotation: Option[Double] = None,
            step: Option[Int] = None,
            style: Option[String] = None,
            useHTML: Option[Boolean] = None,
            x: Option[Double] = None,
            y: Option[Double] = None,
            zIndex: Option[Int] = None): YAxisLabel =
    _apply(
      align, None, autoRotationLimit, distance, enabled, format, formatter, None, None,
      padding, reserveSpace, rotation, None, step, style, useHTML, x, y, zIndex
    )

}

@js.annotation.ScalaJSDefined
class ZAxisLabel extends AxisLabel[ZAxis]
object ZAxisLabel extends AxisLabelCompanion[ZAxis, ZAxisLabel] {
  /**
    * @param align What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @param autoRotation For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
    * @param autoRotationLimit When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
    * @param distance Polar charts only. The label's pixel distance from the perimeter of the plot area.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
    * @param formatter Callback JavaScript function to format the label. The value is .  given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>..  Defaults to: . <pre>function() {. 	return this.value;. }</pre>
    * @param maxStaggerLines Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param padding The pixel padding for axis labels, to ensure white space between them.
    * @param reserveSpace Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>. . <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
    * @param style CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: Option[Align] = None,
            autoRotation: Option[Seq[Double]] = None,
            autoRotationLimit: Option[Double] = None,
            distance: Option[Double] = None,
            enabled: Option[Boolean] = None,
            format: Option[String] = None,
            formatter: Option[(AxisLabel.FormatterData[ZAxis]) => Any] = None,
            maxStaggerLines: Option[Double] = None,
            overflow: Option[String] = None,
            padding: Option[Double] = None,
            reserveSpace: Option[Boolean] = None,
            rotation: Option[Double] = None,
            staggerLines: Option[Double] = None,
            step: Option[Int] = None,
            style: Option[String] = None,
            useHTML: Option[Boolean] = None,
            x: Option[Double] = None,
            y: Option[Double] = None,
            zIndex: Option[Int] = None): ZAxisLabel =
    _apply(
      align, autoRotation, autoRotationLimit, distance, enabled, format, formatter, maxStaggerLines, overflow,
      padding, reserveSpace, rotation, staggerLines, step, style, useHTML, x, y, zIndex
    )
}

@js.annotation.ScalaJSDefined
class ColorAxisLabel extends AxisLabel[ColorAxis]
object ColorAxisLabel extends AxisLabelCompanion[ColorAxis, ColorAxisLabel] {
  /**
    * @param align What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
    * @param formatter Callback JavaScript function to format the label. The value is .  given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>..  Defaults to: . <pre>function() {. 	return this.value;. }</pre>
    * @param maxStaggerLines Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>. . <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
    * @param style CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: Option[Align] = None,
            enabled: Option[Boolean] = None,
            format: Option[String] = None,
            formatter: Option[(AxisLabel.FormatterData[ColorAxis]) => Any] = None,
            maxStaggerLines: Option[Double] = None,
            overflow: Option[String] = None,
            rotation: Option[Double] = None,
            staggerLines: Option[Double] = None,
            step: Option[Int] = None,
            style: Option[String] = None,
            useHTML: Option[Boolean] = None,
            x: Option[Double] = None,
            y: Option[Double] = None,
            zIndex: Option[Int] = None): ColorAxisLabel =
    _apply(
      align, None, None, None, enabled, format, formatter, None, None,
      None, None, rotation, None, step, style, useHTML, x, y, zIndex
    )

}