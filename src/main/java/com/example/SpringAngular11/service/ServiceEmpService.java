package com.example.SpringAngular11.service;

import com.example.SpringAngular11.model.Employe;
import com.example.SpringAngular11.model.ServiceEmp;
import com.example.SpringAngular11.web.dto.model.EmployeDto;
import com.example.SpringAngular11.web.dto.model.ServiceEmpDto;

import java.util.List;

public interface ServiceEmpService {

    ServiceEmp saveEmployeService(ServiceEmp ServiceEmp);
    ServiceEmp editEmployeService(Integer id, ServiceEmpDto serviceEmpDto);
    List<ServiceEmp>getListEmployeService();
    ServiceEmp getEmployeServiceById(Integer id);
    void deleteEmployeServiceById(Integer id);

}