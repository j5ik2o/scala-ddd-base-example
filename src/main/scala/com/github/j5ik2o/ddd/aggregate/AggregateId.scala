package com.github.j5ik2o.ddd.aggregate

trait AggregateId {
  type IdType
  val value: IdType
}

trait AggregateLongId extends AggregateId {
  override type IdType = Long
}