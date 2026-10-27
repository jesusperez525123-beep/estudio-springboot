package com.example.practica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="clientes")
@Data 
@AllArgsConstructor
@NoArgsConstructor 
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String nombre;

    // Direccion de los clientes
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "direccion_id", referencedColumnName = "id")

    private Direccion direccion;

    // Informacion de los clientes
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "informacion_id", referencedColumnName = "id")

    private Informacion informacion;
}
