package com.example.Database;


import com.example.Database.Student;
import com.example.Database.StudentRepository;
import com.example.Database.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student= new Student("abb", "2b", 90.00, 22, "456214");
        service.saveStudent(student);
        return "Student added";
    }



    //https://localhost:4000/create?name=xyz&phone=99999
    @RequestMapping("/create")
    public Student create(HttpServletRequest request){
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Student student=new Student(name, "2a",100.00,20,phone);
        return service.saveStudent(student);
    }
    @RequestMapping("/list")
    public List<Student> list(){

        return service.listAll();
    }
}


