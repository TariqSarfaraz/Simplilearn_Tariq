package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Learner;

public interface LearnerRepository extends JpaRepository<Learner, Integer>{

}
