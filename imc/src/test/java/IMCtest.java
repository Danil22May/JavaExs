import com.imc.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IMCtest {

    @Test
    public void testCalcularIMC() {
        double weight = 70;
        double height = 1.81;
        double imc = IMC.calcularIMC(height, weight);
        assertEquals(21, Math.round(imc));
    }

}
