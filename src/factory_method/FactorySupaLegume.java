package factory_method;

public class FactorySupaLegume implements InterfataFactorySupa {
    @Override
    public Supa creareSupa(double pret, boolean isVegetariana) {
        return new SupaLegume(pret, isVegetariana);
    }
}
