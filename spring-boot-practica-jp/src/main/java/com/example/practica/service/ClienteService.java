package com.example.practica.service;

import com.example.practica.model.Cliente;
import java.util.List;


// DEFINE EL CONTRATO DEL METODO ABC
// Define que acciones puede hacer con un cliente (crar, listar, obtener por id, eliminar) 

public interface ClienteService {

    // Crear un cliente
    Cliente crear(Cliente cliente);

    // Listar todos los clientes
    List<Cliente> listar();

    // Obtener un cliente por su id
    Cliente obtenerPorId(Long id);

    // Eliminar un cliente
    void eliminar(Long id);
}
