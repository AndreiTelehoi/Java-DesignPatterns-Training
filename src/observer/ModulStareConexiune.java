package observer;

import java.util.ArrayList;

//evenimentul observat
public class ModulStareConexiune {
	
	ArrayList<NotificareConexiune> observatori = new ArrayList<>();
	
	public void addListener(NotificareConexiune listener) {
		observatori.add(listener);
	}
	
	public void removeListener(NotificareConexiune listener) {
		observatori.remove(listener);
	}
	
	public void notificareConexiunePierduta() {
		for(NotificareConexiune observator : observatori)
			observator.conexiuneInchisa();
	}
	
}
