package factory_method;

public class FactorySupaCiuperci implements InterfataFactorySupa {
    @Override
    public Supa creareSupa(double pret, boolean isVegetariana) {
        return new SupaCiuperci(pret, isVegetariana);
    }
}
