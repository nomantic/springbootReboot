package com.example.demojar.controllar;

import com.example.demojar.entity.WordEntity;
import com.example.demojar.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newString")
public class NewControllar {

    @Autowired
    public NewService newService;

    @PostMapping("/save")
    public String saveString(String word) {
        newService.saveString(word);
        return word + "has been saved";
    }

    @GetMapping("/get")
    public List<WordEntity> getWordEntity() {
        return newService.getWord();
    }
}
