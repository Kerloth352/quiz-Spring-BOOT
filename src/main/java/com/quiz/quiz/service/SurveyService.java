package com.quiz.quiz.service;

import com.quiz.quiz.model.Survey;
import com.quiz.quiz.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {
    private SurveyRepository surveyRepository;

    @Autowired
    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Survey save(Survey survey){
        return surveyRepository.save(survey);
    }
}
