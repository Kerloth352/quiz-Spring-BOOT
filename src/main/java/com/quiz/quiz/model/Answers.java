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

    public Long getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public Boolean isCorrect() {
        return correct;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }
}
