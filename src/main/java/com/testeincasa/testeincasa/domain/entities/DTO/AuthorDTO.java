package com.testeincasa.testeincasa.domain.entities.DTO;

import com.testeincasa.testeincasa.domain.entities.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {


    private static final long serialVersionUID = 4383949711118579465L;
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
