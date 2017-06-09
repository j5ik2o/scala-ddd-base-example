package example

import com.github.j5ik2o.ddd.repository.{ AggregateReader, AggregateWriter }

import scala.collection.mutable
import scala.concurrent.Future

trait UserRepository extends AggregateReader with AggregateWriter {
  override type AggregateType = User
  override type IdType        = UserId
  override type ResultType[_] = Future[_]
}

object UserRepository {

  def ofMemory(entities: mutable.Map[UserId, User]): UserRepository = new UserRepositoryOnMemory(entities)

}
