package com.quiz.quiz.Answers;

import com.quiz.quiz.Answers.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<Answer,Long> {
}
