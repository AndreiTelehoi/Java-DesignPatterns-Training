package chain;

public class Calator implements ICalator{

	private String nume;
	private int km;
	
	public Calator(String nume, int km) {
		super();
		this.nume = nume;
		this.km = km;
	}
	
	
	public String getNume() {
		return nume;
	}



	public int getKm() {
		return km;
	}



	@Override
	public void deplaseaza(int numarKm) {
		System.out.println(nume + " se deplaseza " + numarKm + " km");
	}

}
