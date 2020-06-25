package memento;

public class CaracterJoc {

    String nume;
    int puncteViata;


    public CaracterJoc(String nume, int puncteViata) {
        super();
        this.nume = nume;
        this.puncteViata = puncteViata;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPuncteViata() {
        return puncteViata;
    }

    public void setPuncteViata(int puncteViata) {
        this.puncteViata = puncteViata;
    }

    public void merge() {
        System.out.println(this.nume);
    }

    public void ataca(String inamic, int puncteAtac) {
        System.out.println(this.nume);
    }

    public void esteLovit(int puncte) {
        System.out.println("Este lovit cu " + puncte);
        this.puncteViata -= puncte;
    }

    public void seVindecaTotal() {
        this.puncteViata = 1000;
    }


    public MementoCaracterJoc salvare() {
        return new MementoCaracterJoc(this.nume, this.puncteViata);
    }

    public void reincarcaStare(MementoCaracterJoc salvareAnterioara) {
        this.nume = salvareAnterioara.getNume();
        this.puncteViata = salvareAnterioara.getPuncteViata();
    }

    @Override
    public String toString() {
        return "CaracterJoc{" +
                "nume='" + nume + '\'' +
                ", puncteViata=" + puncteViata +
                '}';
    }
}
