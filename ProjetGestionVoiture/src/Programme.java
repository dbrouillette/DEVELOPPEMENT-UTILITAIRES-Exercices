import java.util.ArrayList;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Siege mon_siege = new Siege();
		mon_siege.setNumero_siege("J03");
		

		ArrayList<Voiture> liste_voiture = new ArrayList();
		for(int i = 0; i<10; i++) {
			Voiture voiture = new Voiture();
			voiture.marque = "inconnu-" + i;
			liste_voiture.add(voiture);
			
		}
		
		for(int i = 0; i<liste_voiture.size(); i++) {
			Voiture voiture = liste_voiture.get(i);
			System.out.println(voiture.marque);
		}
		
		
		
//		Pneu pneuAG = new Pneu();
//		pneuAG.setUsure_pneu(0);
//		
//		Pneu pneuAD = new Pneu();
//		pneuAD.setUsure_pneu(0);
//
//		Pneu pneuARG = new Pneu();
//		pneuARG.setUsure_pneu(0.95f);
//
//		Pneu pneuARD = new Pneu();
//		pneuARD.setUsure_pneu(0.95f);
//
//		
//		
		Voiture ma_voiture = new Voiture();
		
		if(ma_voiture.doitFaireLePlein() == true) {
			System.out.println("Cette voiture manque d'essence!");
		}

		Voiture ta_voiture = new Voiture();
		
		if(ma_voiture.doitFaireLePlein() == true) {
			System.out.println("Cette voiture manque d'essence!");
		}
		
		
		
	}

}
