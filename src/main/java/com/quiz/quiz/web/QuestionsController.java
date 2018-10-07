package com.quiz.quiz.web;

import com.quiz.quiz.model.Question;
import com.quiz.quiz.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class QuestionsController {
    private QuestionsService questionsService;

    @Autowired
    public QuestionsController(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }


    @GetMapping(path = "/questions")
    public ModelAndView getQuestions(Model model){
        Map<String,Object> questions = new HashMap<>();
        model.addAttribute("questions",questionsService.findAll());
        questions.put("questions",questionsService.findAll());
        return new ModelAndView("questions",questions);
    }

    @GetMapping(path = "/addQuestion")
    public ModelAndView addQuestion(Model model){
        return new ModelAndView("add-question");
    }

    @PostMapping(path = "/addQuestion")
    public String addQuestion(Question question){

        return "adsf";
    }

}
