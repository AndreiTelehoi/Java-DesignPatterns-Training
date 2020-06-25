package adapter.adapter_obiect;

import adapter.framework_achizitionat.CreditLeasing;
import adapter.framework_existent.InterfataCredit;

//daca avem deja obiectul creat
public class AdapterObiectLeasing2Credit implements InterfataCredit {

    private CreditLeasing creditLeasing;

    public AdapterObiectLeasing2Credit(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void afisareCredit() {
        this.creditLeasing.afisareOfertaLeasing();
    }

    @Override
    public double calculeazaRata() {
        return this.creditLeasing.calculRataLeasing();
    }
}
