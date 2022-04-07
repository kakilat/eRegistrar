package com.se.eregistrar.serviceImple;

import com.se.eregistrar.Service.StudentService;
import com.se.eregistrar.model.Student;
import com.se.eregistrar.repository.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImple implements StudentService {

    private StudRepo studRepo;

    @Autowired
    public StudentServiceImple(StudRepo studRepo){
        this.studRepo=studRepo;
    }
    @Override
    public Iterable<Student> getAllStudent() {
        return studRepo.findAll();
    }

    @Override
    public Student addNewStudent(Student student) {
        return studRepo.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studRepo.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudentById(Long studentId) {
        Student student=studRepo.findById(studentId).orElse(null);
        if(student!=null){
            return studRepo.save(student);
        }
        return  null;
    }

    @Override
    public Student getStudentByStudentNumber(String studentNumber) {
        return studRepo.getStudentByNumber(studentNumber);
    }
}
