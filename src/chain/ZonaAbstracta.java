package chain;

public abstract class ZonaAbstracta {

	private String tipZona;
	ZonaAbstracta next;
	
	public ZonaAbstracta(String tipZona) {
		super();
		this.tipZona = tipZona;
	}
	
	public void setNext(ZonaAbstracta next) {
		this.next = next;
	}

	public abstract void decizieTransport(int km);
}
