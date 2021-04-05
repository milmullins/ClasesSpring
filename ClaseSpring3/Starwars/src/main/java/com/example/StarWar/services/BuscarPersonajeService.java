package com.example.StarWar.services;

import com.example.StarWar.dto.PersonajeDTO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
public interface BuscarPersonajeService {
    List<PersonajeDTO> buscarPersonaje(String name);
}
