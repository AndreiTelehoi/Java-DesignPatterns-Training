package factory_method;

public class SupaLegume extends Supa {
    public SupaLegume(double pret, boolean isVegetariana) {
        super(pret, isVegetariana);
    }

    @Override
    public void afisareSupa() {
        System.out.println("Supa de legume ---- pret: " + this.getPret() + " ---- vegetariana: " + this.isVegetariana());
    }
}
