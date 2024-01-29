package com.example.quizapp.dao;

import com.example.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao  extends JpaRepository<Question, Integer> {
    @Query("SELECT q FROM Question q WHERE q.category = ?1")
    List<Question> findByCategory(String category);
}
