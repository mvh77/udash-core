package io.udash.bootstrap
package tooltip

import io.udash.wrappers.jquery._
import org.scalajs.dom

import scala.language.postfixOps
import scala.scalajs.js

class UdashPopover(selector: UdashPopover.UdashPopoverJQuery) extends Listenable[UdashPopover, UdashPopover.TooltipEvent] {
  /** Shows popover. */
  def show(): Unit =
    selector.popover("show")

  /** Hides popover. */
  def hide(): Unit =
    selector.popover("hide")

  /** Toggles popover visibility. */
  def toggle(): Unit =
    selector.popover("toggle")

  /** Destroys popover. */
  def destroy(): Unit =
    selector.popover("destroy")

  import UdashPopover._
  selector.on("show.bs.popover", jQFire(TooltipShowEvent(this)))
  selector.on("shown.bs.popover", jQFire(TooltipShownEvent(this)))
  selector.on("hide.bs.popover", jQFire(TooltipHideEvent(this)))
  selector.on("hidden.bs.popover", jQFire(TooltipHiddenEvent(this)))
  selector.on("inserted.bs.popover", jQFire(TooltipInsertedEvent(this)))
}

object UdashPopover extends TooltipUtils[UdashPopover] {
  override protected def initTooltip(options: js.Dictionary[Any])(el: dom.Node): UdashPopover = {
    val tp: UdashPopoverJQuery = jQ(el).asPopover()
    tp.popover(options)
    new UdashPopover(tp)
  }

  override protected val defaultPlacement: (dom.Element, dom.Element) => Seq[Placement] = (_, _) => Seq(RightPlacement)
  override protected val defaultTemplate: String = {
    import scalatags.Text.all._
    div(cls := BootstrapStyles.Popover.popover.cls, role := "tooltip")(
      div(cls := BootstrapStyles.arrow.cls),
      h3(cls := BootstrapStyles.Popover.popoverTitle.cls),
      div(cls := BootstrapStyles.Popover.popoverContent.cls)
    ).render
  }
  override protected val defaultTrigger: Seq[Trigger] = Seq(ClickTrigger)

  @js.native
  private trait UdashPopoverJQuery extends JQuery {
    def popover(arg: js.Any): UdashPopoverJQuery = js.native
  }

  private implicit class JQueryPopoverExt(jQ: JQuery) {
    def asPopover(): UdashPopoverJQuery =
      jQ.asInstanceOf[UdashPopoverJQuery]
  }
}
