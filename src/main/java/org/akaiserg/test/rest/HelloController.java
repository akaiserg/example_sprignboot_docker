package org.akaiserg.test.rest;

import org.akaiserg.test.response.Response;
import org.akaiserg.test.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private IHelloService service;

    @RequestMapping(value="/test/{name}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public Response add(@PathVariable String name) {
        System.out.println(" calling the api");
        return  service.getInfo(name);
    }

}
