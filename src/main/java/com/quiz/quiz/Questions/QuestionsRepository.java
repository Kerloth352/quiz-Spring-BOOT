package com.quiz.quiz.Questions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Long> {
}
