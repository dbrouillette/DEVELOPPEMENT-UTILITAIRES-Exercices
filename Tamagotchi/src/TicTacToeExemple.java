import java.util.Scanner;

/**
 * The Class TicTacToeExemple.
 */
public class TicTacToeExemple {

	/**
	 * The Enum Possibilites.
	 */
	enum Possibilites {
		  
  		/** The vide. */
  		VIDE,
		  
  		/** The joueur a. */
  		JOUEUR_A,
		  
  		/** The joueur b. */
  		JOUEUR_B
		}

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {

		// exemple d'assignation d'une variable de type énumération
		Possibilites haut_gauche = Possibilites.VIDE;
		Possibilites haut_centre = Possibilites.JOUEUR_A;
		Possibilites haut_droit = Possibilites.JOUEUR_B;
		
		Possibilites milieu_gauche = Possibilites.VIDE;
		Possibilites milieu_centre = Possibilites.VIDE;
		Possibilites milieu_droit = Possibilites.VIDE;

		Possibilites bas_gauche = Possibilites.VIDE;
		Possibilites bas_centre = Possibilites.VIDE;
		Possibilites bas_droit = Possibilites.VIDE;


		// exemple d'un affichage des cases du tableau
		System.out.format("| %s | %s | %s |", AfficherCase(haut_gauche), AfficherCase(haut_centre), AfficherCase(haut_droit));
		System.out.format("| %s | %s | %s |", AfficherCase(milieu_gauche), AfficherCase(milieu_centre), AfficherCase(milieu_droit));
		System.out.format("| %s | %s | %s |", AfficherCase(bas_gauche), AfficherCase(bas_centre), AfficherCase(bas_droit));
		
		// TODO : Ceci est un test..

		// exemple d'un affiche de tableau TICTACTOE
		//		X O X
		//		  X  
		//		O O O

		
		// exemple d'assignation d'une variable vide, à O ou à X en fonction des choix du joueur
        String haut_gauche2 = "X";
		String haut_centre2 = "X";
		String haut_droit2 = "O";
		
		String milieu_gauche2 = "";
        String milieu_centre2 = "";
		String milieu_droit2 = "X";

		String bas_gauche2 = "O";
		String bas_centre2 = "O";
		String bas_droit2 = "O";
	
		
		// exemple d'obtention d'un nombre aléatoire
		double valeur_aleatoire = Math.random()*9;
		int valeur_aleatoire_entiere = (int)valeur_aleatoire;
		

		// exemple d'un calcul pour savoir s'il a gagné ou non...
		//		if(bas_gauche.equals("X") && bas_centre.equals("X") && bas_centre.equals("X")) {
		//			System.out.println("X a gagné...");
		//		}
		
		// exemple d'un calcul pour savoir s'il a gagné (en utilisant des enums)
		//if(bas_gauche == Possibilites.JOUEUR_A && bas_centre == Possibilites.JOUEUR_A && bas_droit == Possibilites.JOUEUR_A) {
		//	System.out.println("X a gagné...");
		//}
		
		int valeur = 65;

		int tauxSucre = Math.min(100, valeur);
		System.out.println("Taux de sucre" + tauxSucre);
		
		
		int choix_menu = AfficherMenu();
		
	}
	
	
	
	/**
	 * Afficher case.
	 *
	 * @param maPossibilite the ma possibilite
	 * @return the string
	 */
	private static String AfficherCase(Possibilites maPossibilite) {
		if(maPossibilite == Possibilites.JOUEUR_A) {
			return "X";
		}else if (maPossibilite == Possibilites.JOUEUR_B) {
			return "O";
		}else {
			return " ";
		}
	}
	
	
	/**
	 * Afficher menu.
	 *
	 * @return the int
	 */
	public static int AfficherMenu() {
		System.out.println("Bonjour, bienvenue dans mon tamagochie:");
		System.out.println("1- Jouer avec moi");
		System.out.println("2- Me faire manger:");
		System.out.println("3- Me faire boire");
		System.out.println("4 - Fin");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Votre choix svp?:");
		int valeur_de_retour = Integer.parseInt(scan.nextLine());
		
		do {
			System.out.println("Mauvais choix, veuillez réessayer!");
			valeur_de_retour = Integer.parseInt(scan.nextLine());

		} while(valeur_de_retour > 4);
		
		
		return valeur_de_retour;
	}
}
