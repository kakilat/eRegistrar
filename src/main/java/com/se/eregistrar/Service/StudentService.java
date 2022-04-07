package com.se.eregistrar.Service;

import com.se.eregistrar.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    public abstract  Iterable<Student> getAllStudent();
    public abstract  Student addNewStudent(Student student);
    public abstract  Student getStudentById(Long studentId);
    Student updateStudentById(Long studentId);
    Student getStudentByStudentNumber(String studentNumber);

}
