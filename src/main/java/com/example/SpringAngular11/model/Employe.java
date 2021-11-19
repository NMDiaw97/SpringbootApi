package com.example.SpringAngular11.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "tp_employe")
@AllArgsConstructor
@NoArgsConstructor
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;
    /*@Column(name = "date_naissance")
    private LocalDate date_naissance;*/
    @Column(name = "specialite")
    private String specialite;
    @Column(name = "experience")
    private String experience;
    @ManyToOne
    @JoinColumn(name= "service_id")
    private ServiceEmp employe_service;




}
