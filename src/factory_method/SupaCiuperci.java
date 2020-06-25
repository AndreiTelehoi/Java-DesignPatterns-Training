package factory_method;

public class SupaCiuperci extends Supa {

    public SupaCiuperci(double pret, boolean isVegetariana) {
        super(pret, isVegetariana);
    }

    @Override
    public void afisareSupa() {
        System.out.println("Supa de ciuperci ---- pret: " + this.getPret() + " ---- vegetariana: " + this.isVegetariana());
    }
}
