package example

import java.util.UUID

import com.github.j5ik2o.ddd.aggregate.{ Aggregate, AggregateId }

import scala.reflect.{ classTag, ClassTag }

case class UserId(value: UUID) extends AggregateId {
  override type IdType = UUID
}

case class User(id: Option[UserId], name: String) extends Aggregate {
  override type AggregateType = User
  override type IdType        = UserId
  override protected val tag: ClassTag[User] = classTag[User]
}
