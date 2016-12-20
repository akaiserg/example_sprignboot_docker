package org.akaiserg.test.service;

import org.akaiserg.test.response.Response;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreskaiser on 19-12-16.
 */
public class ServiceTest {

    @Test
    public void checkInstance() {

        // arrange
        Service service;

        //act
        service = new Service();

        //assert
        assertNotNull(service);

    }

    @Test
    public void checkInterface() {

        IService service;

        service= new Service();

        assertTrue(service instanceof IService);

    }

    @Test
    public void checkResponse(){

        IService service;

        service= new Service();

        Response response= service.getInfo("Andres");

        assertEquals(response.getResult(),"Hello Andres");

    }

}