package com.example.LinkTracker.services;

import com.example.LinkTracker.dto.LinkDTO;
import com.example.LinkTracker.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class LinkServiceImpl implements LinkService{
    @Autowired
    private LinkRepository linkRepository;
    @Override
    public int agregarLink(String link) {
        return linkRepository.agregarLink(link);
    }
    /*public int agregarLink(String link,Optional<String> pass) {
        return linkRepository.agregarLink(link,pass);
    }*/

    @Override
    public HashMap<Integer, LinkDTO> obtenerTodos() {
        return linkRepository.obtenerTodos();
    }

    @Override
    public String redireccionar(int id, Optional<String> pass) {
        return linkRepository.redireccionar(id,pass);
    }

    @Override
    public int metricas(int id) {
        return linkRepository.metricas(id);
    }

    @Override
    public void eliminarLink(int id) {
        linkRepository.eliminarLink(id);
    }
}
