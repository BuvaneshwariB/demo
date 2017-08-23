package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController  
public class SpringBootController {  
    @Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping("/insert")  
    public String index(){  
        jdbc.execute("insert into user(name,email)values('baskar','vb@gmail.com')");  
        return"data inserted Successfully";  
    }  
}  