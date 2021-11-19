package com.example.SpringAngular11.implementation;

import com.example.SpringAngular11.model.Employe;
import com.example.SpringAngular11.model.ServiceEmp;
import com.example.SpringAngular11.repository.ServiceEmpRepository;
import com.example.SpringAngular11.service.EmployeService;
import com.example.SpringAngular11.service.ServiceEmpService;
import com.example.SpringAngular11.web.dto.model.ServiceEmpDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ServiceEmpImpl implements ServiceEmpService {
    @Autowired
    private ServiceEmpRepository serviceEmpRepository;


    @Override
    public ServiceEmp saveEmployeService(ServiceEmp serviceEmp) {
        try {
            return serviceEmpRepository.save(serviceEmp);
        }catch (Exception ex){
            return null;
        }
    }

    @Override
    public ServiceEmp editEmployeService(Integer id, ServiceEmpDto serviceEmpDto) {
        ServiceEmp currentServiceEmp = serviceEmpRepository.findById(id).orElse(null);
        currentServiceEmp.setLibelle(serviceEmpDto.getLibelle());

        return serviceEmpRepository.save(currentServiceEmp);
    }

    @Override
    public List<ServiceEmp> getListEmployeService() {
        return serviceEmpRepository.findAll();
    }

    @Override
    public ServiceEmp getEmployeServiceById(Integer id) {
        return serviceEmpRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployeServiceById(Integer id) {
        serviceEmpRepository.deleteById(id);
    }
}

