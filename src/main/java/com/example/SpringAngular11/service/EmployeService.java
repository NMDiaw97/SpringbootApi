package com.example.SpringAngular11.service;

import com.example.SpringAngular11.model.Employe;
import com.example.SpringAngular11.web.dto.model.EmployeDto;

import java.util.List;

public interface EmployeService {
    Employe saveEmploye(Employe employe);
    Employe editEmploye(Integer id, EmployeDto employeDto);
    List<Employe> getListEmploye();
    Employe getEmployeById(Integer id);
    void deleteEmployeById(Integer id);


}
