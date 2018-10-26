CREATE TABLE SURVEY(
	id varchar(36) PRIMARY KEY,
    title varchar(50) NOT NULL UNIQUE,
    description varchar(100),
    creation_date DATE
)ENGINE=InnoDB;

CREATE TABLE QUESTIONS(
	id VARCHAR(36) PRIMARY KEY,
    description varchar(100) NOT NULL,
    points INTEGER
)ENGINE=InnoDB;

CREATE TABLE SURVEY_QUESTIONS(
	survey_id VARCHAR(36),
    question_id VARCHAR(36),

    FOREIGN KEY(survey_id)
		REFERENCES SURVEY(id),

	FOREIGN KEY(question_id)
		REFERENCES QUESTIONS(id)
)ENGINE=InnoDB;

CREATE TABLE ANSWERS(
	id VARCHAR(36) PRIMARY KEY,
    answer varchar(100) NOT NULL,
    correct bit
)ENGINE=InnoDB;

CREATE TABLE QUESTIONS_ANSWERS(
	question_id VARCHAR(36),
    answer_id VARCHAR(36),

    FOREIGN KEY (question_id)
		REFERENCES QUESTIONS(id),

	FOREIGN KEY (answer_id)
		REFERENCES ANSWERS(id)
)ENGINE=InnoDB;