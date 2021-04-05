package com.example.StarWar.repositories;

import com.example.StarWar.dto.PersonajeDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PersonajeRepositoryImpl implements PersonajeRepository{
    @Override
    public List<PersonajeDTO> buscarPersonaje(String name) {
        List<PersonajeDTO> personajeDTOS = null;
        personajeDTOS = loadDataBase();
        List<PersonajeDTO> result = new ArrayList<>();
            if (personajeDTOS != null){
                result = personajeDTOS.stream().filter(personajeDTO -> personajeDTO.getName().toLowerCase(Locale.ROOT).contains(name))
                        .collect(Collectors.toList());
            }
        return result;
    }

    private List<PersonajeDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonajeDTO>> typeRef = new TypeReference<List<PersonajeDTO>>() {};
        List<PersonajeDTO> personajesDTOS = null;

        try {
            personajesDTOS = objectMapper.readValue(file, typeRef);

        }catch (Exception e){
            e.printStackTrace();
        }

        return personajesDTOS;

    }
}
