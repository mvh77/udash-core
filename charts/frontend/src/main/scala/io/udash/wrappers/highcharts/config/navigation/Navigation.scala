/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package navigation

import scala.scalajs.js


@js.annotation.ScalaJSDefined
class Navigation extends js.Object {

  /**
    * A collection of options for buttons appearing in the exporting module.
    */
  val buttonOptions: js.UndefOr[NavigationButtonOptions] = js.undefined

  /**
    * CSS styles for the hover state of the individual items within the popup menu appearing by
    * default when the export icon is clicked. The menu items are rendered in HTML. Defaults to
    * <pre>menuItemHoverStyle: {
    * background: '#4572A5',
    * color: '#FFFFFF'
    * }</pre>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/" target="_blank">Bold text on hover</a>
    */
  val menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the individual items within the popup menu appearing by
    * default when the export icon is clicked. The menu items are rendered in HTML. Defaults to
    * <pre>menuItemStyle: {
    * padding: '0 5px',
    * background: NONE,
    * color: '#303030'
    * }</pre>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/" target="_blank">Add a grey stripe to the left</a>
    */
  val menuItemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the popup menu appearing by default when the export icon is clicked.
    * This menu is rendered in HTML. Defaults to
    * <pre>menuStyle: {
    * border: '1px solid #A0A0A0',
    * background: '#FFFFFF'
    * }</pre>
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/" target="_blank">Light gray menu background</a>
    */
  val menuStyle: js.UndefOr[js.Object] = js.undefined
}

object Navigation {
  import scala.scalajs.js.JSConverters._

  /**
    * @param buttonOptions      A collection of options for buttons appearing in the exporting module.
    * @param menuItemHoverStyle CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to . <pre>menuItemHoverStyle: {. 	background: '#4572A5',. 	color: '#FFFFFF'. }</pre>
    * @param menuItemStyle      CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to . <pre>menuItemStyle: {. 	padding: '0 5px',. 	background: NONE,. 	color: '#303030'. }</pre>
    * @param menuStyle          CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML. Defaults to . <pre>menuStyle: {. 	border: '1px solid #A0A0A0',. 	background: '#FFFFFF'. }</pre>
    */
  def apply(buttonOptions: Option[NavigationButtonOptions] = None,
            menuItemHoverStyle: Option[String] = None,
            menuItemStyle: Option[String] = None,
            menuStyle: Option[String] = None): Navigation = {
    val buttonOptionsOuter = buttonOptions.orUndefined
    val menuItemHoverStyleOuter = menuItemHoverStyle.map(stringToStyleObject).orUndefined
    val menuItemStyleOuter = menuItemStyle.map(stringToStyleObject).orUndefined
    val menuStyleOuter = menuStyle.map(stringToStyleObject).orUndefined

    new Navigation {
      override val buttonOptions = buttonOptionsOuter
      override val menuItemHoverStyle = menuItemHoverStyleOuter
      override val menuItemStyle = menuItemStyleOuter
      override val menuStyle = menuStyleOuter
    }
  }
}
