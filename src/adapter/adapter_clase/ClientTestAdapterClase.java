package adapter.adapter_clase;

import adapter.framework_existent.CreditLocuinta;
import adapter.framework_existent.InterfataCredit;

public class ClientTestAdapterClase {

    public static void oferaInformatiiCredit(InterfataCredit credit) {
        credit.afisareCredit();
        System.out.println("Rata lunara: " + credit.calculeazaRata());
    }

    public static void main(String[] args) {
        CreditLocuinta creditLocuinta = new CreditLocuinta(70000, 60);
        oferaInformatiiCredit(creditLocuinta);

        AdapterClaseLeasing2Credit creditLeasing = new AdapterClaseLeasing2Credit(9000, 24);
        oferaInformatiiCredit(creditLeasing);
    }
}
