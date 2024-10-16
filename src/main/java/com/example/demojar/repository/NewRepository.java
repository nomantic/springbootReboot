package com.example.demojar.repository;

import com.example.demojar.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<WordEntity, Long> {
    // Define custom query methods here
    WordEntity findByWord(String Word);
}
