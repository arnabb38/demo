package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v0")
@RestController
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(DemoProjectApplication.class);

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/users")
    public List<Employee> getEmployees() {

        long startTime = System.nanoTime();

        log.info("Start getting employee list at: " + startTime);

        List<Employee> allEmp = employeeService.getAllEmp();

        long endTime = System.nanoTime();

        log.info("End getting employee list at: " + endTime);

        var duration = (endTime - startTime);

        log.info("Execution time taken to get Employee data: " + duration + " nano-seconds");

        log.info("Execution time taken to get Employee data: " + (duration / 1000000000) + " seconds");

        return allEmp;
    }

}