package com.example.LinkTracker.repositories;

import com.example.LinkTracker.dto.LinkDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class LinkRepositoryImpl implements LinkRepository{

    private HashMap<Integer,LinkDTO> links = new HashMap<>();
    private int contador=0;

    @Override
    public int agregarLink(String link) {
        contador++;
        links.put(contador,new LinkDTO(link,contador,0));
        return contador;
    }
    /*@Override
    public int agregarLink(String link,Optional<String> pass) {
        contador++;
        if(pass.isPresent())
            links.put(contador,new LinkDTO(link,contador,pass,0));
        else
            links.put(contador,new LinkDTO(link,contador,0));
        return contador;
    }*/

    @Override
    public String redireccionar(int id, Optional<String> pass) {
        if(pass.isPresent()){
            if(links.get(id).getPassword() == pass){
                links.get(id).setCantidadRedirecciones(links.get(id).getCantidadRedirecciones()+1);
                return links.get(id).getUrl();
            }else
                return "Password Incorrecto";
        }else{
            if(links.get(id).getPassword() != null) {
                return "Password Requerido";
            }
            else{
                links.get(id).setCantidadRedirecciones(links.get(id).getCantidadRedirecciones()+1);
                return links.get(id).getUrl();
            }
        }
    }

    @Override
    public int metricas(int id) {
        return links.get(id).getCantidadRedirecciones();
    }

    @Override
    public void eliminarLink(int id) {
        links.remove(id);
    }

    @Override
    public LinkDTO obtenerLink() {
        return null;
    }
    @Override
    public HashMap<Integer,LinkDTO> obtenerTodos() {
        return links;
    }
}
