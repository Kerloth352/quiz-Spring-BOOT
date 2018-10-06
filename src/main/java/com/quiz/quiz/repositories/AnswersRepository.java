package com.quiz.quiz.repositories;

import com.quiz.quiz.model.Answers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends CrudRepository<Answers,Long> {
}
