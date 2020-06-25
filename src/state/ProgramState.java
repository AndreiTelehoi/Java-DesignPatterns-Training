package state;

public class ProgramState {

    public static void main(String[] args) {
        //State

        CaracterJoc superman = new CaracterJoc("Superman", 1000);
        superman.merge();
        superman.ataca("Joker", 100);

        superman.esteLovit(200);
        superman.merge();
        superman.ataca("Joker", 100);

        superman.esteLovit(400);
        superman.merge();
        superman.ataca("Joker", 100);


        superman.esteLovit(360);
        superman.merge();
        superman.ataca("Joker", 100);

        superman.seVindeca(300);
        superman.merge();
        superman.ataca("Joker", 100);
    }
}
