package com.github.j5ik2o.ddd.repository

import scala.concurrent.ExecutionContext

trait IOContext {
  val executionContext: ExecutionContext
  // TODO: DBセッション
}

case class DBIOContext(executionContext: ExecutionContext) extends IOContext
