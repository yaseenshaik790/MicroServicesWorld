package com.asb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.example.model.Student;
import com.asb.example.repository.StudentRepository;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String getStudent(String id) {
        studentRepository.deleteById(id);
        return "Student with id: " + id + " deleted successfully";
    }

    public Student getStudentsById(String id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isEmpty()) {
            return new Student();
        } else {
            return optional.get();
        }
    }
}
