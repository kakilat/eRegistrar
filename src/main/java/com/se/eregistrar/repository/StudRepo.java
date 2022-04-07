package com.se.eregistrar.repository;

import com.se.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepo extends JpaRepository<Student,Long> {

    @Query(value = "select s from Student s where s.studentNumber=:studentNumber")
    public abstract Student getStudentByNumber(String studentNumber);

}
