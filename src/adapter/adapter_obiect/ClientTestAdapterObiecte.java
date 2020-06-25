package adapter.adapter_obiect;

import adapter.framework_achizitionat.CreditLeasing;
import adapter.framework_existent.CreditLocuinta;
import adapter.framework_existent.InterfataCredit;

public class ClientTestAdapterObiecte {

    public static void oferaInformatiiCredit(InterfataCredit credit) {
        credit.afisareCredit();
        System.out.println("Rata lunara: " + credit.calculeazaRata());
    }

    public static void main(String[] args) {

        CreditLocuinta creditLocuinta = new CreditLocuinta(60000, 60);
        oferaInformatiiCredit(creditLocuinta);

        CreditLeasing creditLeasing = new CreditLeasing(8000, 4);
        AdapterObiectLeasing2Credit creditLeasingAdaptat = new AdapterObiectLeasing2Credit(creditLeasing);
        oferaInformatiiCredit(creditLeasingAdaptat);

    }
}
