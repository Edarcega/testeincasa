package com.testeincasa.testeincasa.domain.entities.DTO;

import com.testeincasa.testeincasa.domain.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {


    private static final long serialVersionUID = 3084757977927983377L;
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
