package org.akaiserg.test.service;

import org.akaiserg.test.domain.Person;
import org.akaiserg.test.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andreskaiser on 25-12-16.
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findOne(id);
    }

}
