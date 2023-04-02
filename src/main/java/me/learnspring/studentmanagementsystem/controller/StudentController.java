package me.learnspring.studentmanagementsystem.controller;

import me.learnspring.studentmanagementsystem.entity.Student;
import me.learnspring.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getAllStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "home";
    }

    @GetMapping("students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }
}
