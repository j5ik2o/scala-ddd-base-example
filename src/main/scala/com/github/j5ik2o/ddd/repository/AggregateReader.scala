package com.github.j5ik2o.ddd.repository

trait AggregateReader extends AggregateIO {

  def resolveById(id: IdType)(implicit ioContext: IOContext): ResultType[AggregateType]

}
