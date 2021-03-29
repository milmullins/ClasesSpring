package MeLi.ClaseSpring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodigoMorseController {
    @GetMapping("/traducir")
    public CodigoMorseService toRoman(@RequestParam(value = "morse",defaultValue = "")String morse){

        CodigoMorseService codigoMorseService = new CodigoMorseService(morse,CodigoMorseService.decodificarMorse(morse));

        return codigoMorseService;
    }
}
