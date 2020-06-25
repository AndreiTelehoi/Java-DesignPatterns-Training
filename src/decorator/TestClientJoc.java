package decorator;

public class TestClientJoc {

	public static void main(String[] args) {

		//Decorator
		InterfataCaractereACME superman = 
				new CaracterACME("Superman", 1000);
		InterfataCaractereACME batman = 
				new CaracterACME("Batman", 1000);
		
		superman.getDescriere();
		superman.esteAtacat(200);
		superman.getDescriere();
		
		DecoratorScut supermanCuScut = 
				new DecoratorScut(superman, "Tip 1");
		supermanCuScut.esteAtacat(200);
		supermanCuScut.getDescriere();
		
		DecoratorRanitCritic batmanCuAlerta = 
				new DecoratorRanitCritic(batman);
		
		batmanCuAlerta.esteAtacat(950);
		batmanCuAlerta.getDescriere();
		
		DecoratorRanitCritic supermanCuScutCuAlerta  =
				new DecoratorRanitCritic(supermanCuScut);
		
		supermanCuScutCuAlerta.esteAtacat(1300);
		supermanCuScutCuAlerta.getDescriere();
	}

}
