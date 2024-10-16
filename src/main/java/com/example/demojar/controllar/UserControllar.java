package com.example.demojar.controllar;
import com.example.demojar.entity.Utente;
import com.example.demojar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllar {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Utente createUser(@RequestBody Utente users) {
        return userRepository.save(users);
    }

    @GetMapping
    public List<Utente> getUser(){
        return userRepository.findAll();
    }

}
