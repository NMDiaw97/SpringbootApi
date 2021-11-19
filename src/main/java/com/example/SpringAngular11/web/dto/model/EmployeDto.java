package com.example.SpringAngular11.web.dto.model;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class EmployeDto {
    private  int id;
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String specialite;
    private String experience;


}
