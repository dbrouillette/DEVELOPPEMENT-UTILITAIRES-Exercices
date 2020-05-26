import java.util.Scanner;

public class Jeu {

	private final static int NB_BATTEMENTS_DIMINUER_HYDRATATION = 240;
	private final static int NB_BATTEMENTS_DIMINUER_CALORIE = 1000;
	
	private static int maVariable = 10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean deces = false;
		long compteur_battements =1;
		Scanner scan = new Scanner(System.in);

		
		while(deces == false) {
			System.out.println("Popum-" + compteur_battements);
		

			
			if(compteur_battements % 2500 == 0) {
				System.out.println("Voici mon menu...");
				
				// gros code ici...
				
				String choix = scan.nextLine();
			}


			if(compteur_battements % 100 == 0) {
				System.out.println("Voici mon menu...");
				
				// gros code ici...
				
				String choix = scan.nextLine();
			}

			
			
			
			// je boucle...
			compteur_battements = compteur_battements + 1;
		}
		
	}

}
