package cofrinho;

public class Conversor {
    private static final double dolar_to_real = 5.02;
    private static final double euro_to_real = 5.42;

    public static double convertDollarsToReal(double dolar) {
        return dolar * dolar_to_real;
    }

    public static double convertEuroToReal(double euro) {
        return euro * euro_to_real;

    }
}
