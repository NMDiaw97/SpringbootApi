package com.example.SpringAngular11.implementation;

import com.example.SpringAngular11.model.Employe;
import com.example.SpringAngular11.repository.EmployeRepository;
import com.example.SpringAngular11.service.EmployeService;
import com.example.SpringAngular11.web.dto.model.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
    private EmployeRepository employeRepository;


    @Override
    public Employe saveEmploye(Employe employe) {
        try {
            return employeRepository.save(employe);
        }catch (Exception ex){
            return null;
        }

    }

    @Override
    public Employe editEmploye(Integer id, EmployeDto employeDto) {
        Employe currentEmploye = employeRepository.findById(id).orElse(null);
        currentEmploye.setExperience(employeDto.getExperience());
        currentEmploye.setPrenom(employeDto.getPrenom());
        currentEmploye.setNom(employeDto.getNom());
        currentEmploye.setSpecialite(employeDto.getSpecialite());

        return employeRepository.save(currentEmploye);

    }

    @Override
    public List<Employe> getListEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public Employe getEmployeById(Integer id) {
        return employeRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteEmployeById(Integer id) {
        employeRepository.deleteById(id);
    }
}
