package chain;

public class Zona10Km extends ZonaAbstracta{

	public Zona10Km(String tipZona) {
		super(tipZona);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decizieTransport(int km) {
		// TODO Auto-generated method stub
		if(km < 11)
			System.out.println("Pt o distanta de " + km + "km se ia tramvaiul");
		else
	         if(this.next != null)
	        	 this.next.decizieTransport(km);
	}

}
