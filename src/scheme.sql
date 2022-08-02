CREATE TABLE questions
(
    id       integer,
    question VARCHAR NOT NULL,
    answer   VARCHAR NOT NULL,
    points   integer NOT NULL,
    CONSTRAINT questions_pk PRIMARY KEY (id)
);

insert into questions
values (1, 'question 1', 'answer 1', 1);
insert into questions
values (2, 'question 2', 'answer 2', 2);
insert into questions
values (3, 'question 3', 'answer 3', 3);
insert into questions
values (4, 'question 4', 'answer 4', 4);
insert into questions
values (5, 'question 5', 'answer 5', 5);
insert into questions
values (6, 'question 6', 'answer 6', 1);
insert into questions
values (7, 'question 7', 'answer 7', 2);
insert into questions
values (8, 'question 8', 'answer 8', 3);
insert into questions
values (9, 'question 9', 'answer 9', 4);
insert into questions
values (10, 'question 10', 'answer 10', 5);

CREATE TABLE users
(
    id               SERIAL,
    name             VARCHAR NOT NULL,
    max_total_points numeric,
    points           numeric,
    CONSTRAINT users_pk PRIMARY KEY (id)
);