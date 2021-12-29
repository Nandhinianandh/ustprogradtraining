package com.example.Database;

import com.example.Database.Student;
import com.example.Database.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//                        Service
//  StudentRepository -------------------- Controller

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){

        return repo.save(student);
    }
    public List<Student> listAll(){

        return repo.findAll();
    }
}
