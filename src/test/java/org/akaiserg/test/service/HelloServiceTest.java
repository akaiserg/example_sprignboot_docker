package org.akaiserg.test.service;

import org.akaiserg.test.response.Response;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreskaiser on 19-12-16.
 */
public class HelloServiceTest {

    @Test
    public void checkInstance() {

        // arrange
        HelloService service;

        //act
        service = new HelloService();

        //assert
        assertNotNull(service);

    }

    @Test
    public void checkInterface() {

        IHelloService service;

        service= new HelloService();

        assertTrue(service instanceof IHelloService);

    }

    @Test
    public void checkResponse(){

        IHelloService service;

        service= new HelloService();

        Response response= service.getInfo("Andres");

        assertEquals(response.getResult(),"Hello Andres");

    }

}