package com.example.demo.Repository;

import com.example.demo.Entity.StudentRecords;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentRecords, Integer> {
}
