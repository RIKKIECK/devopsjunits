package calculaprueba;

public class CalculadoraFinanciera {
    public double calcularInteresSimple(double capital, double tasa, int periodo) {
        return capital * tasa * periodo;
    }

    public double calcularInteresCompuesto(double capital, double tasa, int periodo) {
        return capital * Math.pow((1 + tasa), periodo);
    }

    public double calcularAmortizacion(double capital, double tasa, int periodo) {
        double cuota = capital * tasa / (1 - Math.pow((1 + tasa), -periodo));
        return cuota;
    }

    public double calcularTasaEfectiva(double tasaNominal, int frecuencia) {
        double tasaEfectiva = Math.pow((1 + tasaNominal / frecuencia), frecuencia) - 1;
        return tasaEfectiva;
    }
}
