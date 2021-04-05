package com.example.CalculadoraCalorias.services;

import com.example.CalculadoraCalorias.dto.CaloriasResponseDTO;
import com.example.CalculadoraCalorias.dto.IngredienteDTO;
import com.example.CalculadoraCalorias.dto.PlatoDeComidaDTO;
import com.example.CalculadoraCalorias.repositories.CaloriasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcularCaloriasServiceImpl implements CalcularCaloriasService{

    private CaloriasRepository caloriasRepository;

    public CalcularCaloriasServiceImpl(CaloriasRepository caloriasRepository){this.caloriasRepository = caloriasRepository;};

    @Override
    public CaloriasResponseDTO calcularCalorias(PlatoDeComidaDTO platoDeComida) {
        CaloriasResponseDTO respuesta = new CaloriasResponseDTO(platoDeComida);
        obtenerIngredietesCalorias(platoDeComida,respuesta);
        calcularCaloriasTotales(respuesta);
        ingredienteConMasCalorias(respuesta);
        return respuesta;
    }

    public void calcularCaloriasTotales(CaloriasResponseDTO respuesta){
        double caloriasTotales = 0;
        for(IngredienteDTO ingrediente:respuesta.getIngredientes()){
            caloriasTotales += ingrediente.getCalories();
        }
        respuesta.setCaloriasTotales(caloriasTotales);
    }
    public void obtenerIngredietesCalorias(PlatoDeComidaDTO platoDeComida,CaloriasResponseDTO respuesta){
        respuesta.setIngredientes(caloriasRepository.buscarIngredientes(platoDeComida));

    }
    public void ingredienteConMasCalorias(CaloriasResponseDTO respuesta){
        IngredienteDTO ingrediente = new IngredienteDTO();
        for(IngredienteDTO ingre:respuesta.getIngredientes()){
            if(ingre.getCalories() > ingrediente.getCalories())
                ingrediente = ingre;
        }
        respuesta.setIngredienteMasCalorias(ingrediente);
    }
}
