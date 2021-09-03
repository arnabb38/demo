package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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


    @PostMapping("/emps/{pageNo}/{itemCount}")
    public List<Employee> getEmployees(@PathVariable int pageNo, @PathVariable int itemCount) {

        log.info("Request received!");

        List<Employee> allEmp = employeeService.getAllEmp(pageNo, itemCount);

        log.info("Execution completed!");

        return allEmp;
    }

}