package me.learnspring.studentmanagementsystem.repository;

import me.learnspring.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
