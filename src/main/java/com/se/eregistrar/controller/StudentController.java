package com.se.eregistrar.controller;

import com.se.eregistrar.Service.StudentService;


import com.se.eregistrar.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/registrar","/"})
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }


@GetMapping(value = {"/list"})
    public ModelAndView listOfStudents(){
     var modelAndView=new ModelAndView();
     var students=studentService.getAllStudent();
     modelAndView.addObject("students",students);
     modelAndView.setViewName("secured/peblisher/list");
     return modelAndView;
}
@GetMapping(value = {"/new"})
    public String displayNewStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "secured/peblisher/list";
}



}
