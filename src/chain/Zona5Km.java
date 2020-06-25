package chain;

public class Zona5Km extends ZonaAbstracta{

	public Zona5Km(String tipZona) {
		super(tipZona);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decizieTransport(int km) {
		if(km < 6)
			System.out.println("Pt o distanta de "+  km + "km se ia autobuzul");
		else
         if(this.next != null)
        	 this.next.decizieTransport(km);
	}

}
