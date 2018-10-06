package com.quiz.quiz.web;


import com.quiz.quiz.repositories.SurveyRepository;
import com.quiz.quiz.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SurveyController {
    private SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }
}
