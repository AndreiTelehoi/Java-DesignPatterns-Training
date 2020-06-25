package memento;

public class ClientTestMemento {

    public static void main(String[] args) {
        CaracterJoc caracterJoc=new CaracterJoc("superman", 1000);
        ManagerSalvari managerSalvari=new ManagerSalvari();

        System.out.println(caracterJoc.toString());
        managerSalvari.adaugaMemento(caracterJoc.salvare());
        caracterJoc.setPuncteViata(800);
        System.out.println(caracterJoc.toString());
        caracterJoc.setPuncteViata(700);
        managerSalvari.adaugaMemento(caracterJoc.salvare());
        System.out.println(caracterJoc.toString());
        caracterJoc.setPuncteViata(500);
        System.out.println(caracterJoc.toString());

        try{
            caracterJoc.reincarcaStare(managerSalvari.getMemento(0));
            System.out.println(caracterJoc.toString());
        }catch(Exception exception){

        }
    }

}
