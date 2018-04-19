package wang.angi.sample.reactive.redis.repositories;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import wang.angi.sample.reactive.redis.domain.Person;

/**
 * @author angi
 */
public interface ReactivePersonRepository extends ReactiveCrudRepository<Person, String> {

}