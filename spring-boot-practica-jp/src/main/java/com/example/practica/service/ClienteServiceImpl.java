package com.example.practica.service;

import com.example.practica.model.Cliente;
import com.example.practica.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

// DEFINE LA LOGICA DE NEGOCIO
// Implementa los metodos definidos en el contrato de ClienteService
// Derfine COMO se ejecutan las acciones en codigo de ClienteService utiizando el Repositorio
// Facilita cambiar la logica o crear pruebas unitarias sin afectar el Controllador
@Service 
@RequiredArgsConstructor 
// Implementacion de los metodos definidos en el contrato de ClienteService
public class ClienteServiceImpl implements ClienteService {
    
    private final ClienteRepository clienteRepository;
    

    @Override 
    public Cliente crear(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override 
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override 
    public Cliente obtenerPorId(Long id) {
        return clienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + id));
    }
    @Override 
    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
