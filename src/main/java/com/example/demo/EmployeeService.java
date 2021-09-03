package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmp(int pageNo, int itemCount) {
//        List<Employee> employees = new ArrayList<>();

        Pageable paging = PageRequest.of(pageNo, itemCount);
        Page<Employee> pagedResult = employeeRepository.findAll(paging);

//        employeeRepository.findAll().forEach(employees::add);
        return pagedResult.toList();
    }
}