package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.EmployeeRepository;
import com.jpaproject1.springjpa1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/saveEmployee")
    public String saveEmployee(Model model) {
      //  employeeRepository.save(employee);
        return "Employee saved";
    }

       @GetMapping("/getallemployees")
               public List<Employee>employeeList(){
           return employeeRepository.findAll();
        }


        @GetMapping("/getemployee/{id}")
    public Optional<Employee>getEmployeeById(@PathVariable Integer id){
        return employeeRepository.findById(id);
        }

        @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        Optional<Employee>emp=employeeRepository
                .findById(employee.getId());

        emp.get().setName(employee.getName());
        emp.get().setCity(employee.getCity());
        employeeRepository.save(emp.get());
        return "Employee Updated";
        }

        @GetMapping("/employeedetails/{name}/{city}")
    public  List<Employee> getEmployeeByNameAndCity(@PathVariable String name,
                                                    @PathVariable String city){
        return employeeRepository.findByNameAndCity(name, city);
        }

        @DeleteMapping("/deleteemployee/{id}")
    public  String deleteEmployee(@PathVariable Integer id){
        employeeRepository.deleteById(id);
        return "Employee deleted";
        }
    }

