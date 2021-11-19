package com.example.SpringAngular11.web.controller;

import com.example.SpringAngular11.model.Employe;
import com.example.SpringAngular11.service.EmployeService;
import com.example.SpringAngular11.web.dto.model.EmployeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @GetMapping("/employes")
    public List<Employe> getListEmploye() {
        return employeService.getListEmploye();
    }

    @PostMapping(value = "/save")
        public Employe saveEmploye(@RequestBody Employe employe){
        Employe employeSaved = employeService.saveEmploye(employe);
        if(employeSaved != null) {
            return employeSaved;
        }
        return null;
    }

    @PutMapping(value = "/employe/{id}")
    public Employe updateEmploye(@PathVariable Integer employeId, @RequestBody EmployeDto employe){
        Employe employepdated = employeService.editEmploye(employeId,employe);
        if(employepdated != null){
            return employepdated;
        }
        return null;
    }
    @GetMapping("/{id}")
    public Employe getStudentById(@PathVariable Integer employeId){
        Employe employe =  employeService.getEmployeById(employeId);
        if(employe != null){
            return employe;
        }
        return null;
    }










}
