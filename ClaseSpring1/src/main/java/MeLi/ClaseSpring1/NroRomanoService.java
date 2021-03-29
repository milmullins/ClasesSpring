package MeLi.ClaseSpring1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NroRomanoService {

    private int nroInicial;
    private String nroFinal;

    public static String toRoman(int numero) {
        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (numero > 0 || arab.length == (i - 1)) {
            while ((numero - arab[i]) >= 0) {
                numero -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }
}
