package org.akaiserg.test.service;


import org.akaiserg.test.response.Response;
import java.util.concurrent.atomic.AtomicLong;

@org.springframework.stereotype.Service
public class Service implements IService{
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Response getInfo(String data) {
        return  new Response(counter.incrementAndGet(),getMessage(data));
    }

    private String getMessage(String data){
        return "Hello "+data;

    }
}
