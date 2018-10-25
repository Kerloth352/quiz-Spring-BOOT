package com.quiz.quiz.Questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @ModelAttribute(value = "Question")
    public Question question(){
        return new Question();
    }


    @GetMapping(path = "/questions")
    public String getQuestions(Model model){
        model.addAttribute("questionsList",questionsService.findAll());
        return "questions";
    }

    @GetMapping(path = "/addQuestion")
    public String addQuestion(Model model){
        return "add-question";
    }
    @PostMapping(path = "/addQuestion")
    public String addQuestion(@ModelAttribute("Question")Question question){
        questionsService.save(question);
        return "redirect:/questions";
    }


}
