package edu.icet.student_management.service.impl;

import edu.icet.student_management.dto.Student;
import edu.icet.student_management.service.StudentService;

import java.util.List;

public class StudentServiceImplV2 implements StudentService {

    @Override
    public List<Student> getAll() {

        return List.of();
    }

    @Override
    public String getVersion() {

        return "2.0.0V";
    }
}
