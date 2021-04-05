package com.example.CalculadoraCalorias.dto;

import lombok.Data;

import java.util.List;

@Data
public class CaloriasResponseDTO extends PlatoDeComidaDTO{
    private double caloriasTotales;
    //private List<IngredienteDTO> listadoCalorias;
    private IngredienteDTO ingredienteMasCalorias;

    public CaloriasResponseDTO(PlatoDeComidaDTO platoDeComida){
        this.setNombre(platoDeComida.getNombre());
        this.setIngredientes(platoDeComida.getIngredientes());
    }

}
