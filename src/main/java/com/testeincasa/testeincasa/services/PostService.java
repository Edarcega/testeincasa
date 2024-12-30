package com.testeincasa.testeincasa.services;

import com.testeincasa.testeincasa.domain.entities.Post;
import com.testeincasa.testeincasa.repository.PostRepository;
import com.testeincasa.testeincasa.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
