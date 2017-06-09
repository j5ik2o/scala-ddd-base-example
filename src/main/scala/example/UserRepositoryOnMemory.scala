package example

import java.util.UUID

import com.github.j5ik2o.ddd.repository.{ AggregateNotFoundException, IOContext }

import scala.collection.mutable
import scala.concurrent.Future

private[example] class UserRepositoryOnMemory(entities: mutable.Map[UserId, User]) extends UserRepository {

  override def resolveById(id: UserId)(implicit ioContext: IOContext): Future[User] =
    entities.get(id).map(Future.successful).getOrElse(Future.failed(AggregateNotFoundException(id)))

  override def store(aggregate: User)(implicit ioContext: IOContext): Future[UserId] = {
    val id = UserId(UUID.randomUUID())
    entities.put(id, aggregate)
    Future.successful(id)
  }

}
