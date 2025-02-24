package edu.icet.student_management.service.impl;

import edu.icet.student_management.dto.Student;
import edu.icet.student_management.entity.StudentEntity;
import edu.icet.student_management.repository.StudentRepository;
import edu.icet.student_management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImplV2 implements StudentService {

    final StudentRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Student> getAll() {

        return List.of();
    }

    @Override
    public String getVersion() {

        return "2.0.0V";
    }

    @Override
    public void add(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }
}
