package adapter.framework_achizitionat;

public class CreditLeasing {

    private int suma;
    private int nrLuni;

    public CreditLeasing(int suma, int nrLuni) {
        this.suma = suma;
        this.nrLuni = nrLuni;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getNrLuni() {
        return nrLuni;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    public void afisareOfertaLeasing() {
        System.out.println("Leasing-ul este in valoare de " + this.suma);
    }

    public double calculRataLeasing() {
        return suma/nrLuni;
    }
}
