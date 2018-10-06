package com.quiz.quiz.repositories;

import com.quiz.quiz.model.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends CrudRepository<Survey,Long> {
}
