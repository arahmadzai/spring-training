package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "DATE")
    private LocalDate birthDate;
    @Column(name = "TIME")
    private LocalTime birthTime;
    @Column(name = "TIMESTAMP")
    private LocalDateTime birthDateTime;

}
