package org.akaiserg.test.repository;

import org.akaiserg.test.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andreskaiser on 25-12-16.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
