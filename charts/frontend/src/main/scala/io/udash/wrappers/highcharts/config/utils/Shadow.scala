package io.udash.wrappers.highcharts
package config
package utils

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

sealed abstract class Shadow(val value: Boolean | js.Object)

object Shadow {
  case object Enabled extends Shadow(true)
  case object Disabled extends Shadow(false)
  case class Custom(color: Option[Color] = None,
                    offsetX: Option[Double] = None,
                    offsetY: Option[Double] = None,
                    opacity: Option[Double] = None,
                    width: Option[Double] = None)
    extends Shadow(js.Dynamic.literal(
      color = color.map(_.c).orUndefined.asInstanceOf[js.Any],
      offsetX = offsetX.orUndefined,
      offsetY = offsetY.orUndefined,
      opacity = opacity.orUndefined,
      width = width.orUndefined
    ))
}