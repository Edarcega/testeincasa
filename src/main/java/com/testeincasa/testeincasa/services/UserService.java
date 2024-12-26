package com.testeincasa.testeincasa.services;

import com.testeincasa.testeincasa.domain.entities.User;
import com.testeincasa.testeincasa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
