package com.github.j5ik2o.ddd.repository

import com.github.j5ik2o.ddd.aggregate.AggregateId

case class AggregateNotFoundException(id: AggregateId) extends Exception(s"Aggregate is not found: id = $id")
