package com.example.CalculadoraCalorias.services;

import com.example.CalculadoraCalorias.dto.CaloriasResponseDTO;
import com.example.CalculadoraCalorias.dto.PlatoDeComidaDTO;

public interface CalcularCaloriasService {
    public CaloriasResponseDTO calcularCalorias(PlatoDeComidaDTO platoDeComida);
}
