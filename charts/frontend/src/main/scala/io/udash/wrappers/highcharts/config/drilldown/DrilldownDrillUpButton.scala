/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package drilldown

import io.udash.wrappers.highcharts.config.utils.Position

import scala.scalajs.js

@js.annotation.ScalaJSDefined
class DrilldownDrillUpButton extends js.Object {

  /**
    * Positioning options for the button within the <code>relativeTo</code> box.
    * Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.
    */
  val position: js.UndefOr[js.Object] = js.undefined

  /**
    * What box to align the button to. Can be either "plotBox" or "spacingBox".
    */
  val relativeTo: js.UndefOr[String] = js.undefined

  /**
    * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/" target="_blank">Button theming</a>
    */
  val theme: js.UndefOr[js.Object] = js.undefined
}

object DrilldownDrillUpButton {
  import scala.scalajs.js.JSConverters._

  /**
    * @param position   Positioning options for the button within the <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.
    * @param relativeTo What box to align the button to. Can be either "plotBox" or "spacingBox".
    * @param theme      A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
    */
  def apply(position: Option[Position] = None, relativeTo: Option[String] = None, theme: Option[String] = None): DrilldownDrillUpButton = {
    val positionOuter = position.orUndefined
    val relativeToOuter = relativeTo.orUndefined
    val themeOuter = theme.map(stringToStyleObject).orUndefined

    new DrilldownDrillUpButton {
      override val position = positionOuter
      override val relativeTo = relativeToOuter
      override val theme = themeOuter
    }
  }
}
