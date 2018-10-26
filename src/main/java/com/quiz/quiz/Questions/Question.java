package com.quiz.quiz.Questions;

import com.quiz.quiz.Answers.Answer;
import com.quiz.quiz.Surveys.Survey;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(
            name = "uuid",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    private String description;
    private Integer points;

    @ManyToMany(mappedBy = "questions")
    private Set<Survey> surveys = new HashSet<>();

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "questions_answers",
            joinColumns = { @JoinColumn(name = "question_id")},
            inverseJoinColumns = { @JoinColumn(name = "answer_id")}
    )
    private Set<Answer> answers = new HashSet<>();


    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }



    public Set<Survey> getSurveys() {
        return surveys;
    }

    public void setSurveys(Set<Survey> surveys) {
        this.surveys = surveys;
    }

    public Question(String description, Integer points) {
        this.description = description;
        this.points = points;
    }

    public Question() {
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
