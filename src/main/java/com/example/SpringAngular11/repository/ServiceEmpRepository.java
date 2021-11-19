package com.example.SpringAngular11.repository;

import com.example.SpringAngular11.model.ServiceEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceEmpRepository extends JpaRepository<ServiceEmp, Integer> {


}
