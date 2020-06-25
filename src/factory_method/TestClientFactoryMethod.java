package factory_method;

public class TestClientFactoryMethod {

    public static void main(String[] args) {
        InterfataFactorySupa fabricaSupaLegume = new FactorySupaLegume();
        Supa supa1 = fabricaSupaLegume.creareSupa(15, true);
        supa1.afisareSupa();

        InterfataFactorySupa fabricaSupaPui = new FactorySupaPui();
        Supa supa2 = fabricaSupaPui.creareSupa(12, false);
        supa2.afisareSupa();

    }
}
