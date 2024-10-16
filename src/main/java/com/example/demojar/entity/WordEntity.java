package com.example.demojar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String word;
    private Boolean is_empty;
    private Boolean is_odd;
    private Boolean is_palindrome;
    private Boolean contains_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Boolean getIs_empty() {
        return is_empty;
    }

    public void setIs_empty(Boolean is_empty) {
        this.is_empty = is_empty;
    }

    public Boolean getIs_odd() {
        return is_odd;
    }

    public void setIs_odd(Boolean is_odd) {
        this.is_odd = is_odd;
    }

    public Boolean getIs_palindrome() {
        return is_palindrome;
    }

    public void setIs_palindrome(Boolean is_palindrome) {
        this.is_palindrome = is_palindrome;
    }

    public Boolean getContains_number() {
        return contains_number;
    }

    public void setContains_number(Boolean contains_number) {
        this.contains_number = contains_number;
    }
}
