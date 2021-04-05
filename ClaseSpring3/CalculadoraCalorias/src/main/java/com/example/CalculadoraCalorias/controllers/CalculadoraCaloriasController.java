package com.example.CalculadoraCalorias.controllers;

import com.example.CalculadoraCalorias.dto.PlatoDeComidaDTO;
import com.example.CalculadoraCalorias.services.CalcularCaloriasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraCaloriasController {
    @Autowired
    private CalcularCaloriasServiceImpl calcularCaloriasService;

    @GetMapping("/calcularCalorias")
    public ResponseEntity calcular(@RequestBody PlatoDeComidaDTO platoDeComida){
        return new ResponseEntity(calcularCaloriasService.calcularCalorias(platoDeComida), HttpStatus.OK);}
}
