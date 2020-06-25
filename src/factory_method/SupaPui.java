package factory_method;

public class SupaPui extends Supa {
    public SupaPui(double pret, boolean isVegetariana) {
        super(pret, isVegetariana);
    }

    @Override
    public void afisareSupa() {
        System.out.println("Supa de pui ---- pret: " + this.getPret() + " ---- vegetariana: " + this.isVegetariana());
    }
}
