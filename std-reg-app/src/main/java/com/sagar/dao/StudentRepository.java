package com.sagar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sagar.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
