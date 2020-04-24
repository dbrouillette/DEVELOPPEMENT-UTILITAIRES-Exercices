import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Semaine3.
 */
public class Semaine3 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialisation du scanner
		Scanner scan = new Scanner(System.in);

		System.out.print("Veuillez inscrire la question à exécuter:");
		int choix = Integer.parseInt(scan.nextLine());
		switch(choix) {
		case 1: 
			NombreDe1a25(scan);
			break;
		case 2: 
			DessinerUnCarre(scan);
			break;
		case 3:
			DessinerUnTriangleRectangle(scan);
			break;
		default:
			System.out.println("Ceci est un mauvais choix!");
		}
		
		// fermeture du scanner
		scan.close();
	}

	
	/**
	 * Nombre de 1 a 25.
	 *
	 * @param scan the scan
	 */
	public final static void NombreDe1a25(Scanner scan) {
		System.out.println("On peut faire...");
		for(int i = 1; i <=25;i++) {
			System.out.println(i);
		}
		
		System.out.println("Ou on pourrait faire ...");
		int i = 1;
		while(i<=25) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Ou on pourrait faire ...");
		int j = 1;
		do{
			System.out.println(j);
			j++;
		}while(j<=25);

	}

	/**
	 * Dessiner un carre.
	 *
	 * @param scan the scan
	 */
	public final static void DessinerUnCarre(Scanner scan) {
		System.out.print("Bonjour, veuillez indiquer le nombre de lignes: ");
		int nbLignes = Integer.parseInt(scan.nextLine());
		int nbColonnes = nbLignes; // c'est pareil, ici c'est un carré...

		System.out.println("Il existe plusieurs méthodes pour faire un carré...");
		System.out.println("Comme avec des for...:");
		for(int i = 1; i <= nbLignes; i++) {
			for(int j=1; j <= nbColonnes; j++) {
				if(i == 1 || i == nbLignes) {
					System.out.print("* ");
				}else {
					if(j==1 || j == nbColonnes) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.print("\n");// on change de ligne après toutes les colonnes
		}

		System.out.println("Comme avec des while...:");
		int ligneCourante = 1, colonneCourante = 1;
		while(ligneCourante <= nbLignes) {
			while(colonneCourante <= nbColonnes) {
				System.out.print("* ");
				colonneCourante = colonneCourante + 1;
			}
			ligneCourante = ligneCourante + 1; // on descend d'une ligne!;
			System.out.print("\n");// on change de ligne après toutes les colonnes

			colonneCourante = 1; // on remet la colonne au début pour repartir à gauche...
		}


		
		System.out.println("Ou encore avec des Do While...:");
		ligneCourante = 1;
		colonneCourante = 1;
		 do{
			do{
				System.out.print("* ");
				colonneCourante = colonneCourante + 1;
			}while(colonneCourante <= nbColonnes) ;
			
			ligneCourante = ligneCourante + 1; // on descend d'une ligne!;
			System.out.print("\n");// on change de ligne après toutes les colonnes

			colonneCourante = 1; // on remet la colonne au début pour repartir à gauche...
		}while(ligneCourante <= nbLignes);
	}
	
	/**
	 * Dessiner un triangle rectangle.
	 *
	 * @param scan the scan
	 */
	public final static void DessinerUnTriangleRectangle(Scanner scan) {
		System.out.println("Il existe plusieurs méthodes pour faire un triangle rectangle...");
		System.out.println("Cette fois je n'utiliserai qu'un for...:");
		int nbLignes = Integer.parseInt(scan.nextLine());
		int nbColonnes = nbLignes; // c'est pareil, ici c'est un triangle rectangle...

		for(int i = 1; i <= nbLignes; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");// on change de ligne après toutes les colonnes
		}
		
	}


	public final static void DessinerUnCarreVide(Scanner scan) {
		System.out.print("Bonjour, veuillez indiquer le nombre de lignes: ");
		int nbLignes = Integer.parseInt(scan.nextLine());
		int nbColonnes = nbLignes; // c'est pareil, ici c'est un carré...

		for(int i = 1; i <= nbLignes; i++) {
			for(int j=1; j <= nbColonnes; j++) {
				if(i == 1 || i == nbLignes) {
					System.out.print("* ");
				}else {
					if(j==1 || j == nbColonnes) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.print("\n");// on change de ligne après toutes les colonnes
		}
	}
	
}
