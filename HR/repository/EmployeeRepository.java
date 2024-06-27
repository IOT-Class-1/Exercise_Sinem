package com.example.HR.repository;


import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Bu anotasyon, bu sınıfın bir Spring veritabanı deposun olduğunu belirtir.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findById(Long id); // long ıd'nin tipini alır.
}

// JPA --> CRUD işlemleri için gerekli metotları sağlar.
// Create, Read, Update, Delete (CRUD)