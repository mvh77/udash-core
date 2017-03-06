package io.udash.wrappers.highcharts
package config
package utils

import scala.concurrent.duration.FiniteDuration
import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

sealed abstract class Animation(val value: Boolean | js.Object)

object Animation {
  private var wrapperEasingFunNum = 0

  case object Enabled extends Animation(true)
  case object Disabled extends Animation(false)
  case class Custom(duration: Option[FiniteDuration] = None,
                    easing: Option[(Double) => Double] = None)
    extends Animation({
      val name = easing.map(f => {
        wrapperEasingFunNum += 1
        val name = "wrapperEasingFun" + wrapperEasingFunNum
        js.Dynamic.global.Math.updateDynamic(name)(js.Any.fromFunction1(f))
        name
      })

      js.Dynamic.literal(
        duration = duration.map(_.toMillis.toDouble).orUndefined,
        easing = name.orUndefined
      )
    })
}