package com.example.practica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table (name = "informacion_laboral")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class InformacionLaboral {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String correo;
    private String telefono;
}
