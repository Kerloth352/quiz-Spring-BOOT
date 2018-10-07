package com.quiz.quiz.service;

import com.quiz.quiz.model.Question;
import com.quiz.quiz.repositories.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {
    private QuestionsRepository questionsRepository;

    @Autowired
    public QuestionsService(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    public List<Question> findAll(){
        return questionsRepository.findAll();
    }

    public Question findById(Long id){
        return questionsRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    public void save (Question question){
        questionsRepository.save(question);
    }

}
