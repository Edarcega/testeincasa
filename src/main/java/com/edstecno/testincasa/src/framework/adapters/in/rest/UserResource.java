package com.edstecno.testincasa.src.framework.adapters.in.rest;

import com.edstecno.testincasa.src.domain.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll () {
        User u = new User(1L,"Maria","maraia@gmail.com","41-99999-9999","12345");
        return ResponseEntity.ok().body(u);
    }

}
