package rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.services.AutorizationService;
import rest.services.UserService;

@RestController
public class GreetingController {

   @Autowired
   private UserService userService;

    @Autowired
    private AutorizationService autorizationService;
    @GetMapping("/greet")
    public String greetUser() {
        autorizationService.isValid();
        return "Hello, " + userService.getUsername();
    }
}

