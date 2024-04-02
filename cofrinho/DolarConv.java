package cofrinho;

public class DolarConv extends Moeda {
    private static final double br = 5.02;
    double dolar;

    public DolarConv(double dolar, double taxaCambio) {
        super(dolar, taxaCambio);
        this.dolar = dolar;
        this.taxaCambio = taxaCambio;
    }

    @Override
    public String toString() {
        return "Dolar: [Dolar = " + dolar + ", Taxa de Cambio = " + taxaCambio + "]";
    }

    @Override
    double Convert() {
        double total = dolar * br;
        return total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(taxaCambio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dolar);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        DolarConv other = (DolarConv) obj;
        if (Double.doubleToLongBits(taxaCambio) != Double.doubleToLongBits(other.taxaCambio))
            return false;
        if (Double.doubleToLongBits(dolar) != Double.doubleToLongBits(other.dolar))
            return false;
        return true;
    }

}
