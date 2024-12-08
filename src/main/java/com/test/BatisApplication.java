package com.test;

import com.test.mapper.DepartmentsMapper;
import com.test.pojo.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatisApplication.class, args);

    }
}
