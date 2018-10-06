package com.quiz.quiz.model;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Date creation_date;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "survey_questions",
            joinColumns = { @JoinColumn(name = "survey_id")},
            inverseJoinColumns = { @JoinColumn(name = "question_id")}
    )
    private Set<Questions> questions = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreation_date() {
        return creation_date;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Set<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Questions> questions) {
        this.questions = questions;
    }

    public Survey(String title, String description, Date creation_date) {
        this.title = title;
        this.description = description;
        this.creation_date = creation_date;
    }

    public Survey() {
    }
}