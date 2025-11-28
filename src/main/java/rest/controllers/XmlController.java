package rest.controllers;

import model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class XmlController {

    @PostMapping(
            value = "/person",
            consumes = "application/xml",
            produces = "application/xml"
    )
    public Person readXml(@RequestBody Person person) {
        // Spring automatically converts XML → Person
        return person; // return JSON
    }
}
