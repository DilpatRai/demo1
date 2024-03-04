package com.example.demo.Service;

import com.example.demo.Entity.StudentRecords;
import com.example.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<StudentRecords> listAll() {
        List<StudentRecords> studentRecords = new ArrayList<>();
        studentRepo.findAll().forEach(studentRecords::add);
        return studentRecords;
    }

    public void addStudent(StudentRecords studentRecords) {
        studentRepo.save(studentRecords);
    }

}
