package singleton;

public class ClientJoc {

    public static void main(String[] args) {
        try {

            //ContJucator jucator1 = ContJucator.getJucator("Superman", "123456");
            //ContJucator jucator2 = ContJucator.getJucator("Batman", "123456");

            //varianta in care se foloseste constructorul default
            ContJucator jucator1 = ContJucator.getJucator();
            ContJucator jucator2 = ContJucator.getJucator();

            System.out.println(jucator1);
            System.out.println(jucator2);

            ContJucator jucator3 = ContJucator.getJucator("Superman", "123456");

        } catch (ExceptieCreareJucator e) {
            System.out.println("S-a incercat crearea unui jucator diferit !");
        }
    }
}
