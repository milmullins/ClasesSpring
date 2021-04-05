package com.example.StarWar.services;

import com.example.StarWar.dto.PersonajeDTO;
import com.example.StarWar.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuscarPersonajeServiceImpl implements BuscarPersonajeService {
    @Autowired
    private PersonajeRepository personajeRepository;
    @Override
    public List<PersonajeDTO> buscarPersonaje(String name) {
        return personajeRepository.buscarPersonaje(name);
    }
}
