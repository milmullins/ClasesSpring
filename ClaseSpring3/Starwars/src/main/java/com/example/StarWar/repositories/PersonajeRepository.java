package com.example.StarWar.repositories;

import com.example.StarWar.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeRepository {
    List<PersonajeDTO> buscarPersonaje(String name);
}
