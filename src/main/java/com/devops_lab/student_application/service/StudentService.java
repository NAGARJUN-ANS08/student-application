package com.devops_lab.student_application.service;

import com.devops_lab.student_application.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        student.setId((long) (students.size() + 1));
        students.add(student);
        return student;
    }
}