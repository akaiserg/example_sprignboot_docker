package org.akaiserg.test.service;

import org.akaiserg.test.domain.Person;
import org.akaiserg.test.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by andreskaiser on 25-12-16.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService service = new PersonService();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        when(personRepository.findOne(any(Long.class))).thenReturn(new Person());
    }


    @Test
    public void checkInstance() {


        assertNotNull(service);

    }

    @Test
    public void checkInterface(){

        assertTrue(service instanceof  IPersonService);

    }

    @Test
    public void testRepository(){

        Person a = service.getPersonById(1L);
        assertTrue(a instanceof Person);

    }

}