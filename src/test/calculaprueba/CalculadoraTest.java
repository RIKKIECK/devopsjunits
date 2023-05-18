package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void restar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 2);
        assertEquals(3, resultado);
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 2);
        assertEquals(8, resultado);
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado, 0.01);
    }
}