package io.udash.wrappers.highcharts

object Implicits {
  implicit def any2Some[T](t: T): Option[T] = Some(t)
}
