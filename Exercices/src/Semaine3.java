import java.util.Scanner;

/**
 * The Class Semaine3 - Boucles.
 */
public class Semaine3 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
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
		case 4:
			InverserNombres(scan);
			InverserNombres_MethodeAnthony();
			break;
		case 5:
			TableDeMultiplicationsSimple(scan);
			TableDeMultiplicationsProfessionnelle(scan);
			TableDeMultiplicationsProfessionnelleEtTableau(scan);
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
					System.out.print("* ");
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

	/**
	 * Dessiner un carre vide.
	 *
	 * @param scan the scan
	 */
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
	
	/**
	 * Inverser nombres.
	 *
	 * @param scan the scan
	 */
	public static void InverserNombres(Scanner scan) {
		int nombre = Integer.parseInt(scan.nextLine()); // lecture du nombre par l'utilisateur

		String texte_du_nombre = Integer.toString(nombre); // conversion du nombre en string
		
		int nombre_de_cases = texte_du_nombre.length();
		for(int i =  nombre_de_cases -1; i >= 0; i--) {
			System.out.print(texte_du_nombre.charAt(i));
		}
	}
	
	/**
	 * Inverser nombres methode anthony.
	 */
	public static void InverserNombres_MethodeAnthony() {
		int nombre, reverse = 0;
		System.out.println("Quel est votre nombre");

		int monnombre = 10;
		
		Scanner in = new Scanner(System.in);
		nombre = in.nextInt(); 
		while(nombre !=0) {
			reverse = reverse * 10;
			reverse = reverse + nombre%10;
			nombre = nombre/10;
		} 
		
		System.out.println("Votre nombre inversé est " + reverse); 
	}

	
	/**
	 * Inverser nombres methode récursive.
	 *
	 * @param nombre the nombre
	 */
	public static void InverserNombres_MethodeRecursive(int nombre) {
		int nombre1, reverse = 0;
		System.out.println("Quel est votre nombre");

		int monnombre = 10;
		
		try (Scanner in = new Scanner(System.in)) {
			nombre1 = in.nextInt(); 
		} 
		while(nombre1 !=0) {
			reverse = reverse * 10;
			reverse = reverse + nombre1%10;
			nombre1 = nombre1/10;
		} 
		
		System.out.println("Votre nombre inversé est " + reverse); 
	}

	
	/**
	 * Table de multiplications simple.
	 *
	 * @param scan the scan
	 */
	public static void TableDeMultiplicationsSimple(Scanner scan) {
		System.out.print("Combien de lignes voulez-vous calculer?");
		int nb_lignes = Integer.parseInt(scan.nextLine()); // lecture du nombre par l'utilisateur

		for(int i =1; i <= nb_lignes; i++) {
			for(int j = 1; j <= nb_lignes; j++) {
				System.out.print(i*j + " ");
			}

			// fin de la ligne i, on change donc de ligne avec un println vide
			System.out.println(""); 
		}
	}


	/**
	 * Table de multiplications professionnelle.
	 *
	 * @param scan the scan
	 */
	public static void TableDeMultiplicationsProfessionnelle(Scanner scan) {
		System.out.print("Combien de lignes voulez-vous calculer?");
		int nb_lignes = Integer.parseInt(scan.nextLine()); // lecture du nombre par l'utilisateur

		for(int i =1; i <= nb_lignes; i++) {
			for(int j = 1; j <= nb_lignes; j++) {
				System.out.format("%03d ",i*j);
			}

			// fin de la ligne i, on change donc de ligne avec un println vide
			System.out.println(""); 
		}
	}

	
	/**
	 * Table de multiplications professionnelle et tableau.
	 *
	 * @param scan the scan
	 */
	public static void TableDeMultiplicationsProfessionnelleEtTableau(Scanner scan) {
		System.out.print("Combien de lignes voulez-vous calculer?");
		int nb_lignes = Integer.parseInt(scan.nextLine()); // lecture du nombre par l'utilisateur

		GenereLigneSeparatrice(nb_lignes);
		
		for(int i =1; i <= nb_lignes; i++) {
			for(int j = 1; j <= nb_lignes; j++) {
				// si on est sur la première colonne, on affiche le premier |, 
				//sinon, il se mettra automatiquement lors de l'impression du résultat du calcul
				if(j == 1) {
					System.out.print("|");
				}
				System.out.format(" %03d |",i*j);
			}

			// fin de la ligne i, on change donc de ligne avec un println vide
			System.out.println(""); 
		}
		
		GenereLigneSeparatrice(nb_lignes);

	}

	/**
	 * Genere ligne separatrice.
	 *
	 * @param nb_colonnes the nb colonnes
	 */
	private static void GenereLigneSeparatrice(int nb_colonnes) {
		// pour chacune des colonnes, on ajoute 4 tirets (----)
		// ceci permet d'ajuster automatiquement la largeur de la ligne
		for(int i = 1; i<= nb_colonnes; i++) {
			System.out.print("------");
		}

		// on change de ligne
		System.out.println("");
	}
	
}
