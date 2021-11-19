package com.example.SpringAngular11.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "TP_service")
@AllArgsConstructor
@NoArgsConstructor
public class ServiceEmp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceId")
    private int id;
    @Column(name = "Libelle")
    private String libelle;

    /*@OneToMany(mappedBy = "service")
    private List<Employe> employes;*/



}
