package strategy;

import java.util.Random;

public class TestClientJoc {

	public static void main(String[] args) {
		

		//Strategy
		
		System.out.println("------------------------");
		
		ModulPuncteBonus modulBonus = new ModulPuncteBonus(new StrategieFixa());
		
		int puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
		//modificare strategie
		modulBonus.setStrategieCurenta(new StrategieRandom());
		
		puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
		
		modulBonus.setStrategieCurenta(new InterfataCalculPuncteBonus() {
			
			@Override
			public int getPuncteBonus() {
				return 10000;
			}
		});
		
		puncte = modulBonus.getPuncteBonusJucator("Gigel", 1000);
		System.out.println("Gigel a primit " + puncte);
		
	}

}
