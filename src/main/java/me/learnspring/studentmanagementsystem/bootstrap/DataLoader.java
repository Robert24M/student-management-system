package me.learnspring.studentmanagementsystem.bootstrap;

import me.learnspring.studentmanagementsystem.entity.Student;
import me.learnspring.studentmanagementsystem.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentService studentService;

    public DataLoader(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (studentService.getAllStudents().size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        Student student1 = new Student("Robert", "Micu","robert@gmail.com");
        studentService.save(student1);

        Student student2 = new Student("Alina", "Barbu", "alina@gmail.com");
        studentService.save(student2);

        Student student3 = new Student("Sisuca", "The Cat", "sisuca@gmail.com");
        studentService.save(student3);
    }
}
