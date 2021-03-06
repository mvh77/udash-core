package io.udash.bootstrap
package utils

import io.udash._
import io.udash.bootstrap.UdashBootstrap.ComponentId
import org.scalajs.dom

import scalatags.JsDom.all._

class UdashBadge private(override val componentId: ComponentId)(mds: Modifier*) extends UdashBootstrapComponent {
  override lazy val render: dom.Element =
    span(id := componentId, BootstrapStyles.Label.badge)(mds).render
}

object UdashBadge {
  /**
    * Creates badge component.
    * More: <a href="http://getbootstrap.com/javascript/#badges">Bootstrap Docs</a>.
    *
    * @param content Badge content - automatically synchronised with provided property content.
    * @param componentId Id of the root DOM node.
    * @return `UdashBadge` component, call render to create DOM element.
    */
  def apply(content: Property[_], componentId: ComponentId = UdashBootstrap.newId()): UdashBadge =
    new UdashBadge(componentId)(bind(content))

  /**
    * Creates badge component.
    * More: <a href="http://getbootstrap.com/javascript/#badges">Bootstrap Docs</a>.
    *
    * @param content Badge content.
    * @return `UdashBadge` component, call render to create DOM element.
    */
  def apply(content: Modifier*): UdashBadge =
    new UdashBadge(UdashBootstrap.newId())(content)

  /**
    * Creates badge component.
    * More: <a href="http://getbootstrap.com/javascript/#badges">Bootstrap Docs</a>.
    *
    * @param componentId Id of the root DOM node.
    * @param content Badge content.
    * @return `UdashBadge` component, call render to create DOM element.
    */
  def id(componentId: ComponentId, content: Modifier*): UdashBadge =
    new UdashBadge(componentId)(content)
}
