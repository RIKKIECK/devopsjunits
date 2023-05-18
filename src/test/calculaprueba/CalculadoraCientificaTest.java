package calculaprueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraCientificaTest {

    @Deprecated
    @Test
    public void seno() {
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        double delta = 0.0001;
        double resultadoReal = CalculadoraCientifica.seno(5);
        double resultadoReal2 = -0.9589242935180664;
        assertEquals(resultadoReal2, resultadoReal, delta);
    }

}

