package chain;

public class Program {

	public static void main(String[] args) {

		System.out.println("Chain:");
		Zona5Km zona5Km = new Zona5Km("Zona 5km");
		Zona10Km zona10Km = new Zona10Km("ZOna 10km");
		Zona15Km zona15Km = new Zona15Km("Zona 15 km");
		
		zona5Km.setNext(zona10Km);
		zona10Km.setNext(zona15Km);
		
		ZonaAbstracta zona = zona5Km;
		Calator c1 = new Calator("Gigi", 100);
		zona.decizieTransport(c1.getKm());
		zona.decizieTransport(9);


		
	}

}
