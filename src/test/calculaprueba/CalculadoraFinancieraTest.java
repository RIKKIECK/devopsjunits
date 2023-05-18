package calculaprueba;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraFinancieraTest {

    @Test
    public void calcularInteresSimple() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularInteresSimple(1000, 0.05, 2);
        assertEquals(100.0, resultado, 0.01);
    }

    @Test
    public void calcularInteresCompuesto() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularInteresCompuesto(1000, 0.05, 2);
        assertEquals(1102.5, resultado, 0.01);
    }

    @Test
    public void calcularAmortizacion() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularAmortizacion(5000, 0.1, 5);
        assertEquals(1318.987403973726, resultado, 0.01);
    }

    @Test
    public void calcularTasaEfectiva() {
        CalculadoraFinanciera calculadoraFinanciera = new CalculadoraFinanciera();
        double resultado = calculadoraFinanciera.calcularTasaEfectiva(0.1, 12);
        assertEquals(0.10471, resultado, 0.00001);
    }
    // Agrega más pruebas para otros métodos y casos de la CalculadoraFinanciera

}