package MeLi.ClaseSpring1;

import org.springframework.web.bind.annotation.*;

@RestController
public class NrosRomanosRestController {

    @GetMapping("/transformar")
    public NroRomanoService toRoman(@RequestParam(value = "numero",defaultValue = "uno")int numero){
        NroRomanoService nroRomanoService = new NroRomanoService(numero,NroRomanoService.toRoman(numero));

        return nroRomanoService;
    }
}
