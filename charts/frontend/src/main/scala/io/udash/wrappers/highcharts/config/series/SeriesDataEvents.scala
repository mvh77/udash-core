/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series

import io.udash.wrappers.jquery.JQueryEvent

import scala.scalajs.js
import scala.scalajs.js.ThisFunction

@js.annotation.ScalaJSDefined
class SeriesDataEvents extends js.Object {

  /**
    * Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function.
    * This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    *
    * <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state.
    * Returning <code>false</code> cancels this action.</p>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click/" target="_blank">Click marker to alert values</a>,
    *          <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/" target="_blank">click column</a>,
    *          <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/" target="_blank">go to URL</a>
    */
  val click: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Boolean]] = js.undefined

  /**
    * Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function.
    * This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/" target="_blank">Show values in the chart's corner on mouse over</a>
    */
  val mouseOut: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Any]] = js.undefined

  /**
    * Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function.
    * This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/" target="_blank">Show values in the chart's corner on mouse over</a>
    */
  val mouseOver: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Any]] = js.undefined

  /**
    * Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>,
    * is passed to the function. Returning <code>false</code> cancels the operation.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/" target="_blank">Remove point and confirm</a>
    */
  val remove: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Boolean]] = js.undefined

  /**
    * Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>,
    * is passed to the function. Returning <code>false</code> cancels the operation.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/" target="_blank">Report the last selected point</a>
    */
  val select: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Boolean]] = js.undefined

  /**
    * Fires when the point is unselected either programmatically or following a click on the point.
    * One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/" target="_blank">Report the last unselected point</a>
    */
  val unselect: js.UndefOr[js.ThisFunction1[api.Point, JQueryEvent, Boolean]] = js.undefined

  /**
    * Fires when the point is updated programmatically through the <code>.update()</code> method.
    * One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through
    * <code>event.options</code>. Returning <code>false</code> cancels the operation.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/" target="_blank">Confirm point updating</a>
    */
  val update: js.UndefOr[js.ThisFunction1[api.Point, SeriesDataEvents.UpdateEvent, Boolean]] = js.undefined
}

object SeriesDataEvents {
  import scala.scalajs.js.JSConverters._

  @js.native
  trait UpdateEvent extends JQueryEvent {
    def options: api.Point
  }

  /**
    * @param click     <p></p>Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.<p></p> <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state. Returning <code>false</code> cancels this action.</p>
    * @param mouseOut  Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param mouseOver Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param remove    Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param select    Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param unselect  Fires when the point is unselected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param update    Fires when the point is updated programmatically through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through <code>event.options</code>. Returning <code>false</code> cancels the operation.
    */
  def apply(click: Option[(api.Point, JQueryEvent) => Boolean] = None,
            mouseOut: Option[(api.Point, JQueryEvent) => Any] = None,
            mouseOver: Option[(api.Point, JQueryEvent) => Any] = None,
            remove: Option[(api.Point, JQueryEvent) => Boolean] = None,
            select: Option[(api.Point, JQueryEvent) => Boolean] = None,
            unselect: Option[(api.Point, JQueryEvent) => Boolean] = None,
            update: Option[(api.Point, SeriesDataEvents.UpdateEvent) => Boolean] = None): SeriesDataEvents = {
    val clickOuter = click.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Boolean]).orUndefined
    val mouseOutOuter = mouseOut.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Any]).orUndefined
    val mouseOverOuter = mouseOver.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Any]).orUndefined
    val removeOuter = remove.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Boolean]).orUndefined
    val selectOuter = select.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Boolean]).orUndefined
    val unselectOuter = unselect.map(ThisFunction.fromFunction2[api.Point, JQueryEvent, Boolean]).orUndefined
    val updateOuter = update.map(ThisFunction.fromFunction2[api.Point, SeriesDataEvents.UpdateEvent, Boolean]).orUndefined

    new SeriesDataEvents {
      override val click = clickOuter
      override val mouseOut = mouseOutOuter
      override val mouseOver = mouseOverOuter
      override val remove = removeOuter
      override val select = selectOuter
      override val unselect = unselectOuter
      override val update = updateOuter
    }
  }
}
