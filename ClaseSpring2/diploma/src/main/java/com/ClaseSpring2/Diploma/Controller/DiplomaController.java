package com.ClaseSpring2.Diploma.Controller;

import com.ClaseSpring2.Diploma.Dto.AlumnoDto;
import com.ClaseSpring2.Diploma.Services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    @GetMapping("/diploma")
    public ResponseEntity obtenerDiploma(@RequestBody AlumnoDto alumno){
        return new ResponseEntity(AlumnoService.obtenerDiploma(alumno), HttpStatus.OK);
    }
}
