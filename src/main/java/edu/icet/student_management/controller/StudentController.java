package edu.icet.student_management.controller;

import edu.icet.student_management.dto.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @PostMapping("")
    public void add() {

    }

    public List<Student> getName() {
        return ;
    }
}
