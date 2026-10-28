package com.example.practica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "direcciones")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Direccion {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String calle;
    private String ciudad;
    private String codigoPostal;
    private String estado;
    private String pais;
}
