package prototype;

public class Client implements InterfataPrototypeClient{

    private String nume;
    private int puncteBonus;

    public Client(String nume, int puncte) {
        this.nume = nume;
        //TODO: calcularea punctelor bonus este costisitoare ca timp
        this.puncteBonus = puncte/2 + 5 + nume.length();
    }

    public Client() {
        this.nume = "Ion Popescu";
        this.puncteBonus = 0;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPuncteBonus() {
        return puncteBonus;
    }

    public void setPuncteBonus(int puncteBonus) {
        this.puncteBonus = puncteBonus;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", puncteBonus=" + puncteBonus +
                '}';
    }

    @Override
    public InterfataPrototypeClient clonare() {
        Client clonaClient = new Client();
        clonaClient.setNume(this.nume);
        clonaClient.setPuncteBonus(this.puncteBonus);
        return clonaClient;
    }
}
