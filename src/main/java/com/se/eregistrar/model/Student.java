package com.se.eregistrar.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "students")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "student_id")
    private long studentId;

@Column(name = "student_number",nullable = false)
    private String studentNumber;

    @Column(name = "first_name" ,nullable=false)
    private String firstName;

    @Column(name = "middle_name",nullable = true)
    private String middleName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "ctga",nullable = true)
    private double ctga;

    @Column(name = "enrollment_date",nullable = false)
    private LocalDate enrollmentDate;

    @Column(name = "is_international",nullable = true)
    private  boolean isInternational;

}
