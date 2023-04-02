package me.learnspring.studentmanagementsystem.service;

import me.learnspring.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student save(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
