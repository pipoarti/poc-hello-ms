package es.bpi.pochelloworld.controller;

import es.bpi.pochelloworld.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class PocHelloWorldController {

    @GetMapping
    public ResponseEntity<List<User>> getUsers () {

        return new ResponseEntity<List<User>>(Arrays.asList(new User("Sergio")), HttpStatus.OK);
    }
}

