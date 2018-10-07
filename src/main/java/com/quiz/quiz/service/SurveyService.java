package com.quiz.quiz.service;

import com.quiz.quiz.model.Survey;
import com.quiz.quiz.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Survey> findAll(){
        return surveyRepository.findAll();
    }

    public Survey findById(Long id){
        return surveyRepository.findById(id).orElseThrow(() -> new RuntimeException("survey not found"));
    }

}
