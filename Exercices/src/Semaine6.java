
public class Semaine6 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		//System.out.println(cars[1]);
//		
//		long[] tableau_de_long = {100,200,300,400,500,600,1000,2000,5400};
////		System.out.println(tableau_de_long[2]);
////		
////		
//		
//		// navigation régulière du tableau
//		int taille_de_mon_tableau = tableau_de_long.length;
//		for(int idx = 0; idx < taille_de_mon_tableau;idx++) {
//			System.out.println(tableau_de_long[idx]);
//		}
//
//		
//		String[] tableau_voitures = {"Volvo", "BMW", "Ford", "Mazda"};
//		for (String voiture : tableau_voitures) {
//		  System.out.println(voiture);
//		}
//		
//		
//		
//		
//		
//
//		tableau_de_long[3] = 0;
//		tableau_de_long[4] = 0;
//		
//		System.out.println("-------------------------------- Séparation de ligne ici... ------------------");
//		
//		
//		
//		for(int idx = 0; idx < tableau_de_long.length;idx++) {
//			System.out.println(tableau_de_long[idx]);
//		}
//		
//		System.out.println("La taille de mon tableau est " + tableau_de_long.length);
//		
//		
//		System.out.println("-------------------------------- Séparation de ligne ici... ------------------");
//		
//		long ancienne_valeur = tableau_de_long[0];
//		tableau_de_long[0] = tableau_de_long[7];
//		tableau_de_long[7] = ancienne_valeur;
//		
//		// for each
//		for(long valeur_cellule : tableau_de_long) {
//			System.out.println(valeur_cellule);			
//		}
		
		int[] tableauA = {1,2,3,4};
		int[] tableauB = {3,4,5,6};
		
		for(int i = 0;i < tableauB.length;i++){
			//System.out.println(tableauA[i]);
			
			boolean trouve = false;
//			for(int j = 0; j < tableauB.length;j++) {
//				if(tableauA[i] == tableauB[j]) {
//					System.out.println("J'ai un match " + tableauA[i]);
//					trouve = true;
//					break;
//				}else {
//					System.out.println("J'ai aucun match pour l'instant: " + tableauA[i] + " par rapport à " + tableauB[j]);
//					trouve=false;
//				}
//			}
			
			int j = 0;
			while(trouve == false && j < tableauA.length) {
				if(tableauB[i] == tableauA[j]) {
					//System.out.println("J'ai un match " + tableauA[i]);
					trouve = true;
				}else {
					//System.out.println("J'ai aucun match pour l'instant: " + tableauA[i] + " par rapport à " + tableauB[j]);
					trouve=false;
				}

				j = j+ 1;
			}
			
			
			if(trouve == false) {
				System.out.println("La valeur n'a pas été trouvée dans le second tableau : " + tableauB[i]);
			}else {
//				System.out.println("La valeur a été trouvée dans le second tableau : " + tableauA[i]);
			}
		}
		
		
//		
//		int[][] tableau_2dimension = {{1,2,3,4},{5,6,7}};
		
		//System.out.println(tableau_2dimension[1][0]);
//		
//		
//		for(int index_de_ma_ligne = 0; index_de_ma_ligne < tableau_2dimension.length ; index_de_ma_ligne++) {
//			for(int index_de_ma_colonne = 0; index_de_ma_colonne < tableau_2dimension[index_de_ma_ligne].length; index_de_ma_colonne++) {
//				System.out.println(tableau_2dimension[index_de_ma_ligne][index_de_ma_colonne]);
//			}
//		}
//		
		
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int[] tableau_entier = {100,200,300,400};
//		System.out.println(tableau_entier[0]);
//		System.out.format("La taille du tableau est de %d.\n",tableau_entier.length);
		
	
//		for(int valeur_cellule : tableau_entier) {
//			System.out.format("La valeur du tableau est de %d.\n",valeur_cellule);
//		}
		
		
		
		
//		tableau_entier[1] = tableau_entier[2];
//		for(int valeur_cellule : tableau_entier) {
//			System.out.format("La valeur du tableau est de %d.\n",valeur_cellule);
//		}

		
		

		
	}

}
