package com.github.j5ik2o.ddd.repository

trait AggregateWriter extends AggregateIO {

  def store(aggregate: AggregateType)(implicit ioContext: IOContext): ResultType[IdType]

}

trait AggregateDeleteFeature { this: AggregateWriter =>

  def delete(id: IdType)(implicit ioContext: IOContext): ResultType[Unit]

}
