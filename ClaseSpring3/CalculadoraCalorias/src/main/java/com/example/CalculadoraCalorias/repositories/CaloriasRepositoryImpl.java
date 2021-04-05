package com.example.CalculadoraCalorias.repositories;

import com.example.CalculadoraCalorias.dto.IngredienteDTO;

import com.example.CalculadoraCalorias.dto.PlatoDeComidaDTO;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CaloriasRepositoryImpl implements CaloriasRepository{
    @Override
    public List<IngredienteDTO> buscarIngredientes(PlatoDeComidaDTO platoDeComida) {
        List<IngredienteDTO> ingredienteDTOS = null;
        ingredienteDTOS = loadDataBase();
        List<IngredienteDTO> result = new ArrayList<>();
        int i =0;
        for(IngredienteDTO ingrediente: platoDeComida.getIngredientes())
        if (ingredienteDTOS != null){
            Optional<IngredienteDTO> item = ingredienteDTOS.stream()
                    .filter(ingredienteDTO -> ingredienteDTO.getName().equals(ingrediente.getName()))
                    .findFirst();
            if (item.isPresent()){
                result.add(item.get());
                result.get(i).setWeight(ingrediente.getWeight());
                result.get(i).setCalories(Math.round(((result.get(i).getCalories()/100)*ingrediente.getWeight()) * 100.0) / 100.0);
                i++;
            }
        }
        return result;
    }

    private List<IngredienteDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<List<IngredienteDTO>>() {};
        List<IngredienteDTO> ingredienteDTOS = null;

        try {
            ingredienteDTOS = objectMapper.readValue(file, typeRef);

        }catch (Exception e){
            e.printStackTrace();
        }

        return ingredienteDTOS;

    }
}
