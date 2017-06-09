package com.github.j5ik2o.ddd.aggregate

import scala.reflect.ClassTag

trait Aggregate {

  type AggregateType <: Aggregate

  type IdType <: AggregateId

  val id: Option[IdType]

  protected val tag: ClassTag[AggregateType]

  def canEqual(other: Any): Boolean = tag.runtimeClass.isInstance(other)

  override def equals(other: Any): Boolean = other match {
    case tag(that) => (that canEqual this) && id == that.id
    case _         => false
  }

  override def hashCode(): Int = 31 * id.##

}
