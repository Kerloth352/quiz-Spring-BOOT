package com.quiz.quiz.Questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;
import java.util.UUID;

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

    public void delete(Question question){
        questionsRepository.delete(question);
    }



}
