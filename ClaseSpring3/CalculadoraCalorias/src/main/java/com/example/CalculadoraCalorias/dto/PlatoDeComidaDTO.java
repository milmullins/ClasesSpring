package com.example.CalculadoraCalorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDeComidaDTO {
    private String nombre;
    private List<IngredienteDTO> ingredientes;
}
