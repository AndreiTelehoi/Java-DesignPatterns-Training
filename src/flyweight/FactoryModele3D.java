package flyweight;

import java.util.HashMap;

public class FactoryModele3D {
	
	private HashMap<String, InterfataFlyModel3D> modele;
	
	//eager instantiation
//	static {
//		modele = new HashMap<>();
//		modele.put("Copac", new FlyModel3D("copac.img", "Copac"));
//		modele.put("Soldat", new FlyModel3D("soldat.img", "Soldat"));
//	}


	public FactoryModele3D() {
		this.modele = new HashMap<String, InterfataFlyModel3D>();
	}

	public InterfataFlyModel3D getModel(String tip) {
		InterfataFlyModel3D model = modele.get(tip);


		if(model == null) {
			model = new FlyModel3D(tip+".img", tip);
			modele.put(tip, model);
		}
		
		return model;
	}
}
