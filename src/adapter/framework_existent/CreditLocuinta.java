package adapter.framework_existent;

public class
CreditLocuinta implements InterfataCredit{

    private int suma;
    private int nrLuni;

    public CreditLocuinta(int suma, int nrLuni) {
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

    @Override
    public void afisareCredit() {
        System.out.println("Creditul de locuinta este in valoare de " + this.suma);
    }

    @Override
    public double calculeazaRata() {
        return suma/nrLuni;
    }
}
