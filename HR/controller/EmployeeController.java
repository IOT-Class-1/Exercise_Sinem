package com.example.HR.controller;

import com.example.HR.model.Employee;
import com.example.HR.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // bu sınıfın kontrol sınıfı / RESTful web servisi olduğunu belirtir.
@RequestMapping("/api/employees") // temel url'i belirtir.
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/hire") // işe almak için kullanılır
    public Employee hireEmployee(@RequestBody Employee employee){
        return employeeService.hireEmployee((employee));
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}") // çalışanları getirmek için servis sınıfımızdan oluşturduğumuz
    // "getAllEmployees" metotu çağırarak döndürüyoruz.
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}") // belirtilen kimlikteki çalışan bilgilerini
    // bu metot ile update/güncelliyoruz.
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employeeDetails){
        return employeeService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/fire/{id}")
    public void fireEmployee(@PathVariable Long id){
        employeeService.fireEmployee(id);
    }



}
