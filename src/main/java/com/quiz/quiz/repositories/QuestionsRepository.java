package com.quiz.quiz.repositories;

import com.quiz.quiz.model.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions,Long> {
}
