package com.example.LinkTracker.controllers;

import com.example.LinkTracker.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;

    @PostMapping("/{link}")
    public ResponseEntity agregarLink(@PathVariable String link){
        return new ResponseEntity(linkService.agregarLink(link), HttpStatus.OK);
    }
   /* @PostMapping("/{link}/{pass}")
    public ResponseEntity agregarLink(@PathVariable String link,@PathVariable Optional<String> pass){
        return new ResponseEntity(linkService.agregarLink(link,pass), HttpStatus.OK);
    }*/
    @GetMapping("/obtenerLinks")
    public ResponseEntity obtenerLinks() {
        return new ResponseEntity(linkService.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}/{pass}")
    public ModelAndView redireccionar(@PathVariable int id, Optional<String> pass) {
        String url = linkService.redireccionar(id,pass);
        return new ModelAndView("redirect:http://" + url);
    }
    @GetMapping("/metricas/{id}")
    public ResponseEntity metricas(@PathVariable int id){
        return new ResponseEntity("Cantidad de Redirecciones: " + linkService.metricas(id),HttpStatus.OK);}


    @GetMapping("/invalidar/{id}")
    public ResponseEntity invalidar(@PathVariable int id){
        linkService.eliminarLink(id);
        return new ResponseEntity("ID link eliminado: " + id,HttpStatus.OK);}
}
