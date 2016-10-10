package io.udash.wrappers.highcharts
package config
package utils

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


@ScalaJSDefined
class Position extends js.Object {
  val align: js.UndefOr[String] = js.undefined
  val verticalAlign: js.UndefOr[String] = js.undefined
  val x: js.UndefOr[Double] = js.undefined
  val y: js.UndefOr[Double] = js.undefined
}

object Position {
  import scala.scalajs.js.JSConverters._

  def apply(align: Option[Align] = None,
            verticalAlign: Option[VerticalAlign] = None,
            x: Option[Double] = None,
            y: Option[Double] = None): Position = {
    val alignOuter = align.map(_.name).orUndefined
    val xOuter = x.orUndefined
    val verticalAlignOuter = verticalAlign.map(_.name).orUndefined
    val yOuter = y.orUndefined

    new Position {
      override val align = alignOuter
      override val x = xOuter
      override val verticalAlign = verticalAlignOuter
      override val y = yOuter
    }
  }

  implicit class PositionWrapper(p: Position) {
    def getAlign: Option[Align] =
      p.align.toOption.map(Align.ByName)

    def getVerticalAlign: Option[VerticalAlign] =
      p.verticalAlign.toOption.map(VerticalAlign.ByName)
  }
}
