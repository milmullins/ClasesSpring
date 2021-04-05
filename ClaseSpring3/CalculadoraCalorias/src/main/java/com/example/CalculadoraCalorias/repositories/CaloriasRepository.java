package com.example.CalculadoraCalorias.repositories;

import com.example.CalculadoraCalorias.dto.IngredienteDTO;
import com.example.CalculadoraCalorias.dto.PlatoDeComidaDTO;

import java.util.List;

public interface CaloriasRepository {
    public List<IngredienteDTO> buscarIngredientes(PlatoDeComidaDTO platoDeComida);
}
