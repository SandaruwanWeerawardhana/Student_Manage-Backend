package edu.icet.student_management.service;

import edu.icet.student_management.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    String getVersion();
}
