package facade;

import proxy.Login;

public class ProgramFacade {

    public static void main(String[] args) {
        //Facade
        //actiuni pentru a accesa forumul
        ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
        conexiune.connect();
        proxy.Login modulLogin = new Login();
        modulLogin.login("test", "test");
        ForumJoc forum = new ForumJoc();
        Profil profilJucator = new Profil();
        conexiune.disconnect();

        //cu interfata simplificata
        FacadeAPIJoc apiJoc = new FacadeAPIJoc();
        apiJoc.accesForum();
    }
}
