package factory_method;

public abstract class Supa {

    private double pret;
    private boolean isVegetariana;

    public Supa(double pret, boolean isVegetariana) {
        this.pret = pret;
        this.isVegetariana = isVegetariana;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public boolean isVegetariana() {
        return isVegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        isVegetariana = vegetariana;
    }

    public abstract void afisareSupa();
}
