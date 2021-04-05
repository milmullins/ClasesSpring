package com.example.StarWar.controllers;

import com.example.StarWar.repositories.PersonajeRepository;
import com.example.StarWar.services.BuscarPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "/personaje")
public class StarWarsController {
    @Autowired
    private BuscarPersonajeService buscarPersonajeService;

    @GetMapping("/{name}")
    public ResponseEntity buscarPersonaje(@PathVariable String name){
        return new ResponseEntity(buscarPersonajeService.buscarPersonaje(name), HttpStatus.OK);
    }
}
