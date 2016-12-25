package org.akaiserg.test.rest;

import org.akaiserg.test.domain.Person;
import org.akaiserg.test.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andreskaiser on 25-12-16.
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private IPersonService service;

    @RequestMapping(value="/persons/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person add(@PathVariable Long id) {
        System.out.println(" calling the api.....");
        return  service.getPersonById(id);
    }
}
