package com.example.demo.Controller;
import com.example.demo.Entity.StudentRecords;
import com.example.demo.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class studentController {
    @Autowired
    private studentService studentService;

    @RequestMapping("/studentRecords")
    public List<StudentRecords> getAllStudents() {
        return studentService.listAll();
    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentRecords studentRecords) {
        studentService.addStudent(studentRecords);
    }
}
