package factory_method;

public class FactorySupaPui implements InterfataFactorySupa {
    @Override
    public Supa creareSupa(double pret, boolean isVegetariana) {
        return new SupaPui(pret, isVegetariana);
    }
}
