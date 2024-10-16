package com.example.demojar.service;

import com.example.demojar.entity.WordEntity;
import com.example.demojar.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewService {

    @Autowired
    public NewRepository newRepository;

    public void saveString(String s) {
        // perform some operation with the string
        WordEntity we = new WordEntity();
        we.setWord(s);
        if (s.matches(".\\d+.")){
            we.setContains_number(true);
        }else we.setContains_number(false);
        if(s.equals("")){
            we.setIs_empty(true);
        }else we.setIs_empty(false);
        if(s.length()+1/2 == 0){
            we.setIs_odd(false);
        }else we.setIs_odd(true);
        if(is_palindromo(s) == true){
            we.setIs_palindrome(true);
        }else we.setIs_palindrome(false);
      newRepository.save(we);
    }

    public boolean is_palindromo(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse().toString();
        if(sb.toString().equalsIgnoreCase(s)){
            return true;
        }else return false;
    }

    public List<WordEntity> getWord(){
        return newRepository.findAll();
    }
}
