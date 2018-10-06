package com.quiz.quiz.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "answers")
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String answer;
    private Boolean correct;

    @ManyToMany(mappedBy = "answers")
    private Set<Questions> questions = new HashSet<>();

    public Answers(String answer, Boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public Answers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Set<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Questions> questions) {
        this.questions = questions;
    }
}
