package com.devops_lab.student_application;

import com.devops_lab.student_application.model.Student;
import com.devops_lab.student_application.service.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testAddStudent() {
        StudentService service = new StudentService();

        Student student = new Student(null, "Nagarjun", "nagarjun@example.com");

        Student result = service.addStudent(student);

        assertEquals(1L, result.getId());
        assertEquals("Nagarjun", result.getName());
        assertEquals("nagarjun@example.com", result.getEmail());
    }
}