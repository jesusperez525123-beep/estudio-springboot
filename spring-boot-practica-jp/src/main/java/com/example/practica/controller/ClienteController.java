package com.example.practica.controller;

import com.example.practica.model.Cliente;
import com.example.practica.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor 
public class ClienteController {
    
    private final ClienteService clienteService;

    // 1.Crear el POST para crear un cliente
    @PostMapping
    public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteService.crear(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCliente);
    }


}
