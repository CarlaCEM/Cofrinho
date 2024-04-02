package cofrinho;

public class EuroConv extends Moeda {
    private static final double br = 5.41;
    double euro;

    public EuroConv(double euro, double taxaCambio) {
        super(euro, taxaCambio);
        this.euro = euro;
        this.taxaCambio = taxaCambio;
    }

    @Override
    public String toString() {
        return "Euro: [Euro = " + euro + ", Taxa de Cambio = " + taxaCambio + "]";
    }

    @Override
    double Convert() {
        double total = euro * br;
        return total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(taxaCambio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(euro);
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
        EuroConv other = (EuroConv) obj;
        if (Double.doubleToLongBits(taxaCambio) != Double.doubleToLongBits(other.taxaCambio))
            return false;
        if (Double.doubleToLongBits(euro) != Double.doubleToLongBits(other.euro))
            return false;
        return true;
    }

}
