import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Validar soma")
    public void realizarSoma(){
        Calculadora c = new Calculadora();
        Assertions.assertEquals(11, c.somar(5, 6));
    }

    @Test
    @DisplayName("Validar subtração")
    public void realizarSubtracao(){
        Calculadora c = new Calculadora();
        Assertions.assertEquals(117, c.subtrair(120, 3));
    }

    @Test
    @DisplayName("Validar multiplicação")
    public void realizarMultiplicacao(){
        Calculadora c = new Calculadora();
        Assertions.assertEquals(100, c.multiplicar(20, 5));
    }

    @Test
    @DisplayName("Validar divisão")
    public void realizarDivisao(){
        Calculadora c = new Calculadora();
        Assertions.assertEquals(4, c.dividir(20, 5));
    }
}
