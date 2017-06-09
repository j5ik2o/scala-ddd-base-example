package com.github.j5ik2o.ddd.repository

import com.github.j5ik2o.ddd.aggregate.{ Aggregate, AggregateId }

trait AggregateIO {
  type AggregateType <: Aggregate
  type IdType <: AggregateId
  type ResultType[_]
}
