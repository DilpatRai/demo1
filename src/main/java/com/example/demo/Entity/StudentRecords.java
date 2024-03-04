package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentrecords", schema = "userrecord")
public class StudentRecords {
    @Id
    private int id;
    private String name;
    private String course;
    private int age;

    public StudentRecords() {
    }

    public StudentRecords(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

@Override
    public String toString(){
        return "StudentRecords [id="+id+", name="+name+", course="+course+", age="+age+"]";
    }

}
