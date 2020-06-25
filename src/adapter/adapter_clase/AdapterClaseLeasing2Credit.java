package adapter.adapter_clase;

import adapter.framework_achizitionat.CreditLeasing;
import adapter.framework_existent.InterfataCredit;

public class AdapterClaseLeasing2Credit extends CreditLeasing implements InterfataCredit{

    public AdapterClaseLeasing2Credit(int suma, int nrLuni) {
        super(suma, nrLuni);
    }

    @Override
    public void afisareCredit() {
        super.afisareOfertaLeasing();
    }

    @Override
    public double calculeazaRata() {
        return super.calculRataLeasing();
    }
}
