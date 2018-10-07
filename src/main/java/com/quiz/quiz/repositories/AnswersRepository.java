package com.quiz.quiz.repositories;

import com.quiz.quiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<Answer,Long> {
}
