package flyweight;

import java.util.ArrayList;
import java.util.Random;

public class ProgramFlyweight {

    public static void main(String[] args) {
        //Flyweight
//        ArrayList<InterfataFlyModel3D> obiecteEcran = new ArrayList<>();
//        obiecteEcran.add(FactoryModele3D.getModel("Copac"));
//        obiecteEcran.add(FactoryModele3D.getModel("Copac"));
//        obiecteEcran.add(FactoryModele3D.getModel("Copac"));
//        obiecteEcran.add(FactoryModele3D.getModel("Soldat"));
//        obiecteEcran.add(FactoryModele3D.getModel("Soldat"));
//
//        String[] culori = new String[] {"albastru", "verde", "rosu"};
//        Random random = new Random();
//
//        for(InterfataFlyModel3D model : obiecteEcran) {
//            DetaliiAfisareEcran detalii =
//                    new DetaliiAfisareEcran(random.nextInt(100),
//                            random.nextInt(100), culori[random.nextInt(3)]);
//            model.afisareEcranModel3D(detalii);
//        }

        FactoryModele3D factory = new FactoryModele3D();
        InterfataFlyModel3D model3D = factory.getModel("Copac");

        DetaliiAfisareEcran detaliiAfisareEcran1 = new DetaliiAfisareEcran(27, 19, "rosu");
        DetaliiAfisareEcran detaliiAfisareEcran2 = new DetaliiAfisareEcran(30, 29, "verde");

        model3D.afisareEcranModel3D(detaliiAfisareEcran1);
        model3D.afisareEcranModel3D(detaliiAfisareEcran2);
    }

}
