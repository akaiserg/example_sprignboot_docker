package org.akaiserg.test.service;



import org.akaiserg.test.response.Response;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class HelloService implements IHelloService{
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Response getInfo(String data) {
        return  new Response(counter.incrementAndGet(),getMessage(data));
    }

    private String getMessage(String data){
        return "Hello "+data;

    }
}
