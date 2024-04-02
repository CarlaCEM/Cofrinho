package cofrinho;

public abstract class Moeda {
    double valor;
    double taxaCambio;

    public Moeda(double valor, double taxaCambio) {
        super();
        this.valor = valor;
        this.taxaCambio = taxaCambio;
    }

    abstract double Convert();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(taxaCambio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (Double.doubleToLongBits(taxaCambio) != Double.doubleToLongBits(other.taxaCambio))
            return false;
        return true;
    }

}
