package com.example.controller;

import com.example.Model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/")
public class EmployeeController
{
            @RequestMapping("/")
            public List<Employee> getEmployees()
            {
                List<Employee> employeesList = new ArrayList<Employee>();
                employeesList.add(new Employee(1,"Meghana","kagita","meghanakagitha@gmail.com"));
                return employeesList;
            }
        }
