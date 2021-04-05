package com.example.LinkTracker.services;

import com.example.LinkTracker.dto.LinkDTO;

import java.util.HashMap;
import java.util.Optional;

public interface LinkService {
    int agregarLink(String link);
    //int agregarLink(String link,Optional<String> pass);
    HashMap<Integer, LinkDTO> obtenerTodos();
    String redireccionar(int id, Optional<String> pass);
    int metricas(int id);
    void eliminarLink(int id);
}
