package com.example.LinkTracker.repositories;

import com.example.LinkTracker.dto.LinkDTO;

import java.util.HashMap;
import java.util.Optional;

public interface LinkRepository {
    int agregarLink(String link);
    //int agregarLink(String link,Optional<String> pass);
    String redireccionar(int id, Optional<String> pass);
    int metricas(int id);
    void eliminarLink(int id);
    LinkDTO obtenerLink();
    HashMap<Integer,LinkDTO> obtenerTodos();
}
