import java.util.Scanner;

public class Jeu {

	private final static int NB_BATTEMENTS_DIMINUER_HYDRATATION = 240;
	private final static int NB_BATTEMENTS_DIMINUER_CALORIE = 1000;
	
	private static int maVariable = 10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean deces = false;
		long compteur_battements =0;
		Scanner scan = new Scanner(System.in);

		
		while(deces == false) {
			System.out.print("Bedoum ...");
			
			System.out.println(Math.random());
			
			
			if(compteur_battements % NB_BATTEMENTS_DIMINUER_CALORIE == 0) {
				// faire ceci!
			}

			if(compteur_battements % NB_BATTEMENTS_DIMINUER_HYDRATATION == 0) {
				// faire cela!
			}

			
			
			// AVC en cours...
			if(compteur_battements == 96734) {
				deces = true;
				System.out.println("Je suis décédé... :o(");
			}

			
			if(compteur_battements == 250) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
			}

			
			if(compteur_battements == 500) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
				
			}

			
			if(compteur_battements == 750) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
				
			}

			
			if(compteur_battements == 1000) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
				
			}

			
			if(compteur_battements == 1250) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
				
			}

			
			if(compteur_battements == 1500) {
				System.out.println("Voici mon menu...");
				String choix = scan.nextLine();
			}

			
			
			
			// je boucle...
			compteur_battements = compteur_battements + 1;
		}
		
	}

}
