package com.ClaseSpring2.CalculadoraM2.Controller;

import com.ClaseSpring2.CalculadoraM2.Services.CasaServices;
import com.ClaseSpring2.CalculadoraM2.dto.CasaDto;
import com.ClaseSpring2.CalculadoraM2.dto.DetalleDto;
import com.ClaseSpring2.CalculadoraM2.dto.HabitacionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalculadoraController {
    @GetMapping("/Casa")
    public ResponseEntity obtenerDatosCasa(@RequestBody CasaDto casa) {
        return new ResponseEntity(CasaServices.getDetalle(casa), HttpStatus.OK);
    }
}
