package facade;

import proxy.Login;

public class FacadeAPIJoc {
	
	public void accesForum() {
		//actiuni pentru a accesa forumul
		ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
		conexiune.connect();
		Login modulLogin = new Login();
		modulLogin.login("test", "test");
		ForumJoc forum = new ForumJoc();
		Profil profilJucator = new Profil();
		conexiune.disconnect();
	}
	
	
	public Profil getProfilJucator() {
		ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
		conexiune.connect();
		Login modulLogin = new Login();
		modulLogin.login("test", "test");
		Profil profilJucator = new Profil();
		conexiune.disconnect();
		return profilJucator;
	}

}
