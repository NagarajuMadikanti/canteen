package com.navexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.navexam.model.Question;



@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}