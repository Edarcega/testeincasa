package com.testeincasa.testeincasa.resources;

import com.testeincasa.testeincasa.domain.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping(value = "/users")
public class UserResource {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User a = new User("1", "Maria Brown", "maria@gmail.com");
        User b = new User("1", "Alex Green", "alex@gmail.com");
        List<User> list = new ArrayList<>(Arrays.asList(a, b));
        return ResponseEntity.ok().body(list);
    }

}
