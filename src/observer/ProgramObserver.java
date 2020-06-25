package observer;

public class ProgramObserver {

    public static void main(String[] args) {
        //Observer
        ModulStareConexiune stareConexiune = new ModulStareConexiune();

        stareConexiune.notificareConexiunePierduta();

        ModulInstantaJoc instantJoc = new ModulInstantaJoc();

        stareConexiune.addListener(instantJoc);
        stareConexiune.addListener(new ModulInterfataJoc());

        stareConexiune.notificareConexiunePierduta();

        stareConexiune.removeListener(instantJoc);

        stareConexiune.notificareConexiunePierduta();

        stareConexiune.addListener(new NotificareConexiune() {
            @Override
            public void conexiuneInchisa() {
                System.out.println(
                        "Observator eveniment. Conexiune pierduta");
            }
        });

        stareConexiune.notificareConexiunePierduta();
    }
}
