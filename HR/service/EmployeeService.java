package com.example.HR.service;

import com.example.HR.model.Employee;
import com.example.HR.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService { // bu anotasyon, bu sınıfın bir servis sınıfı lduğunu belirtir.

@Autowired //Spring bu alanı otomatik olarak inject/enjekte eder.
    private EmployeeRepository employeeRepository; // interface'ten kopyaladık

    public Employee hireEmployee(Employee employee){
    //yeni bir çalışanı veritabanına kaydeder.
    return employeeRepository.save(employee);
}

    public List <Employee> getAllEmployees(){ // tüm listeyi getirir.
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){ // belirtilen kimlikteki çalışanı veritababnından getirir.
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found!!"));
        // if else gibi düşünebiliriz.
        //orelse yani if döngüsünün else kısmı gibi düşünülebilir.aranan çalışan bulunamadığı için durur.

        employee.setName(employeeDetails.getName());
        employee.setPosition(employeeDetails.getPosition());
        return employeeRepository.save(employee);
    }
    public void fireEmployee(Long id) { // belirtilen kimlikteki çalışanı silme metotu
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found"));

        employeeRepository.delete(employee);
    }


}
