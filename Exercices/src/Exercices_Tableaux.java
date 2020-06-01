/*
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercices_Tableaux.
 */
public class Exercices_Tableaux {

	/** The Constant TABLEAU_A. */
	final static int[] TABLEAU_A = { 1, 2, 11, 30, 4, 5, 6, 7, 8, 9, 10 };
	
	/** The Constant TABLEAU_B. */
	final static int[] TABLEAU_B = { 6, 5, 4, 7, 3, 9, 10, 90 };
	
	/** The Constant TABLEAU_C. */
	final static int[][] TABLEAU_C = { { 10, 20, 30 }, { 40, 50, 60 }, { 71, 81, 91 } };

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Veuillez inscrire la question à exécuter:");
		int choix = Integer.parseInt(scan.nextLine());
		switch (choix) {
		case 1:
			SommeTableauA();
			break;
		case 2:
			SommeTableauAetB();
			break;
		case 3:
			MoyenneTableauAetB();
			break;
		case 4:
			MinMaxTableauA();
			break;
		case 5:
			System.out.print("Veuillez inscrire une valeur à rechercher dans le tableau A,B et C:");
			int valeur_recherche = Integer.parseInt(scan.nextLine());

			if (RechercheValeur(valeur_recherche, TABLEAU_A) == true) {
				System.out.format("La valeur %d a été trouvée dans le tableau A.\n", valeur_recherche);
			}

			if (RechercheValeur(valeur_recherche, TABLEAU_B) == true) {
				System.out.format("La valeur %d a été trouvée dans le tableau B.\n", valeur_recherche);
			}

			if (RechercheValeur(valeur_recherche, TABLEAU_C) == true) {
				System.out.format("La valeur %d a été trouvée dans le tableau C.\n", valeur_recherche);
			}

			break;
		case 6:
			SommeLignesEtColonnes(TABLEAU_C);

			break;
		case 7:
			InverserTableau(TABLEAU_B);

		case 8:
			int[] copie_tableau;

			// on doit prendre une copie du tableau pour éviter de trier l'original...
			copie_tableau = TABLEAU_B.clone();
			TrierTableau_MethodeCourte(copie_tableau);

			// on doit prendre une copie du tableau pour éviter de trier l'original...
			copie_tableau = TABLEAU_B.clone();
			TrierTableau_MethodeLonge_BubbleSort(copie_tableau);

			break;
		case 9:
			RechercheValeursCommunes(TABLEAU_A, TABLEAU_B);
			break;
		case 10:
			RechercheValeursDistinctes(TABLEAU_A, TABLEAU_B);
			break;
		case 11:
			TroisPlusGrandesValeurs(TABLEAU_A);
			break;

		default:
			System.out.println("Ceci est un mauvais choix!");
		}
	}

	/**
	 * Recherche valeur.
	 *
	 * @param valeur_recherchee the valeur recherchee
	 * @param tableau_recherche the tableau recherche
	 * @return true, if successful
	 */
	private static boolean RechercheValeur(int valeur_recherchee, int[] tableau_recherche) {
		boolean valeur_trouvee = false;
		int index_tableau = 0;

		while (valeur_trouvee == false && index_tableau < tableau_recherche.length) {
			if (tableau_recherche[index_tableau] == valeur_recherchee) {
				valeur_trouvee = true;
			}
			;

			index_tableau = index_tableau + 1;
		}

		return valeur_trouvee;
	}

	/**
	 * Recherche de valeurs distinctes entre 2 tableaux.
	 *
	 * @param tableau1 the tableau 1
	 * @param tableau2 the tableau 2
	 */
	private static void RechercheValeursDistinctes(int[] tableau1, int[] tableau2) {
		ArrayList valeurs_distinctes = new ArrayList();
		
		System.out.format("Premier tableau : %s. \n", Arrays.toString(tableau1));
		System.out.format("Second tableau : %s. \n", Arrays.toString(tableau2));
		boolean valeur_trouve = false;

		// on doit parcourir le tableau 1 pour comparer avec les éléments du tableau 2		
		for (int i = 0; i < tableau1.length; i++) {
			valeur_trouve = RechercheValeur(tableau1[i], tableau2);
			if(valeur_trouve == false) {
				System.out.format("La valeur %d est distincte entre les 2 tableaux. \n", tableau1[i]);
			}
		}
		
		// mais aussi on doit parcourir le tableau 2 pour comparer les éléments du tableau 1
		for (int i = 0; i < tableau2.length; i++) {
			valeur_trouve = RechercheValeur(tableau2[i], tableau1);
			if(valeur_trouve == false) {
				System.out.format("La valeur %d est distincte entre les 2 tableaux. \n", tableau2[i]);
			}

		}
	}
	
	
	/**
	 * Recherche valeurs communes entre 2 tableaux.
	 *
	 * @param tableau1 : tableau 1
	 * @param tableau2 : tableau 2
	 */
	private static void RechercheValeursCommunes(int[] tableau1, int[] tableau2) {
		System.out.format("Premier tableau : %s. \n", Arrays.toString(tableau1));
		System.out.format("Second tableau : %s. \n", Arrays.toString(tableau2));

		for (int i = 0; i < tableau1.length; i++) {
			for (int j = 0; j < tableau2.length; j++) {
				if (tableau1[i] == (tableau2[j])) {
					System.out.format("La valeur %d est commune dans les 2 tableaux.\n", tableau1[i]);
				}
			}
		}
	}

	/**
	 * Somme lignes et colonnes d'un tableau.
	 *
	 * @param tableau_pour_calcul : le tableau de calcul
	 */
	private static void SommeLignesEtColonnes(int[][] tableau_pour_calcul) {

		// on va créer un tableau de la largeur du nombre de cellule pour conserver les
		// valeurs de chacunes des lignes
		int somme_lignes[] = new int[tableau_pour_calcul[0].length];

		// pour la colonne, on pourra simplement l'afficher à la fin de chaque lignes
		int somme_colonnes = 0;

		// ici on va faire un nouveau tableau tableau avec une ligne de plus et une
		// colonne de plus que ce qu'on a reçu
		// on pourra stocker les sommes dans cette dernière cellule et cela facilitera
		// l'affichage.

		for (int index_ligne = 0; index_ligne < tableau_pour_calcul.length; index_ligne++) {
			for (int index_colonne = 0; index_colonne < tableau_pour_calcul.length; index_colonne++) {
				// on recopie la cellule dans le tableau d'affichage final
				System.out.format("%3d ", tableau_pour_calcul[index_ligne][index_colonne]);

				// on calcul la somme de la colonne...
				somme_colonnes = tableau_pour_calcul[index_ligne][index_colonne] + somme_colonnes;

				// on calcule la somme de la ligne, et on la conserve dans la cellule
				// correspondant à la ligne
				somme_lignes[index_colonne] = somme_lignes[index_colonne]
						+ tableau_pour_calcul[index_ligne][index_colonne];
			}

			// affichage de la somme pour toutes les colonnes
			System.out.format(" --> %3d \n", somme_colonnes);

			// on doit réinitialiser la somme lorsqu'on change de ligne pour repatir le
			// calcul à 0.
			somme_colonnes = 0;

		}

		// génération d'une ligne à taille variable en fonction du nombre d'items dans
		// le tableau
		for (int i = 0; i < somme_lignes.length; i++) {
			System.out.print("-------");
		}
		System.out.println("");

		// affichage des éléments du tableau résumant le calcul de chacune des lignes
		for (int i = 0; i < somme_lignes.length; i++) {
			System.out.format("%3d ", somme_lignes[i]);
		}

	}

	/**
	 * Recherche valeur.
	 *
	 * @param valeur_recherchee : La valeur recherchée
	 * @param tableau_recherche : Le tableau recherché
	 * @return true, if successful
	 */
	private static boolean RechercheValeur(int valeur_recherchee, int[][] tableau_recherche) {
		boolean valeur_trouvee = false;
		int index_tableau = 0;

		while (valeur_trouvee == false && index_tableau < tableau_recherche.length) {
			// plutôt que de refaire le code pour trouver la valeur d'un tableau, on peut
			// simplement réutiliser la fonction RechercheValeur
			// mais en lui retournant le tableau retournée par la dimension
			// tableau_recherche[index_tableau]...
			valeur_trouvee = RechercheValeur(valeur_recherchee, tableau_recherche[index_tableau]);
			index_tableau = index_tableau + 1;
		}

		return valeur_trouvee;
	}

	
	
	
	/**
	 * Trois plus grandes valeurs.
	 *
	 * @param tableau_recherche : le tableau pour la recherche
	 */
	private static void TroisPlusGrandesValeurs(int[] tableau_recherche) {
		 int premier, second, troisieme; 
		
		 premier = Integer.MIN_VALUE;
		 second = Integer.MIN_VALUE;
		 troisieme = Integer.MIN_VALUE;
		

		 for (int i = 0; i < tableau_recherche.length ; i ++) 
	        { 
	            /* If current element is greater than 
	            first*/
	            if (tableau_recherche[i] > premier) 
	            { 
	            	troisieme = second; 
	                second = premier; 
	                premier = tableau_recherche[i]; 
	            } 
	        
	            /* If arr[i] is in between first and 
	            second then update second  */
	            else if (tableau_recherche[i] > second) 
	            { 
	            	troisieme = second; 
	                second = tableau_recherche[i]; 
	            } 
	        
	            else if (tableau_recherche[i] > troisieme) 
	            	troisieme = tableau_recherche[i]; 
	        } 
	        
	        System.out.format("Les trois plus grandes valeurs sont %d, %d et %d. \n.",premier,second,troisieme); 
	}

	
	
	
	
	
	
	/**
	 * Inverser tableau.
	 *
	 * @param tableau : le tableau à inverser
	 */
	private static void InverserTableau(int[] tableau) {
		// tableau dans l'ordre réel
		System.out.println("Tableau original:");
		for (int i = 0; i < tableau.length; i++) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");

		// tableau dans l'ordre inversé
		System.out.println("Tableau inversé:");
		for (int i = tableau.length - 1; i >= 0; i--) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");
	}

	/**
	 * Trier tableau methode courte.
	 *
	 * @param tableau : le tableau
	 */
	private static void TrierTableau_MethodeCourte(int[] tableau) {
		// tableau dans l'ordre réel
		System.out.println("Tableau original:");
		for (int i = 0; i < tableau.length; i++) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");

		Arrays.sort(tableau);

		// tableau après le tri inversé
		System.out.println("Tableau après le tri:");
		for (int i = 0; i < tableau.length; i++) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");
	}

	/**
	 * Trier tableau methode longue bubble sort.
	 *
	 * @param tableau : le tableau
	 */
	private static void TrierTableau_MethodeLongue_BubbleSort(int[] tableau) {
		// tableau dans l'ordre réel
		System.out.println("Tableau original:");
		for (int i = 0; i < tableau.length; i++) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");

		// voir le lien suivant pour l'explication complète
		// https://fr.wikipedia.org/wiki/Tri_%C3%A0_bulles

		boolean fin_tri = false;
		int valeur_temporaire;

		// tant qu'il y a des choses à trier...
		while (!fin_tri) {
			fin_tri = true;
			for (int i = 0; i < tableau.length - 1; i++) {
				// si la valeur est plus grande, on les inverses
				if (tableau[i] > tableau[i + 1]) {
					valeur_temporaire = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = valeur_temporaire;

					// on indique qu'on vient de faire un changement donc on devra repasser
					fin_tri = false;
				}
			}

			// le tri s'arrêtera lorsqu'on aura parcouru le tableau sans inverser de valeurs
		}

		// tableau après le tri inversé
		System.out.println("Tableau après le tri:");
		for (int i = 0; i < tableau.length; i++) {
			System.out.format("%d ", tableau[i]);
		}
		System.out.println("");
	}

	/**
	 * Somme tableau A.
	 */
	private static void SommeTableauA() {
		int somme_tableau_a = 0;
		for (int i = 0; i < TABLEAU_A.length; i++) {
			somme_tableau_a = somme_tableau_a + TABLEAU_A[i];
		}

		System.out.format("La somme du tableau est de %d.", somme_tableau_a);
	}

	/**
	 * Somme tableau aet B.
	 */
	private static void SommeTableauAetB() {
		int somme_tableaux = 0;
		for (int i = 0; i < TABLEAU_A.length; i++) {
			somme_tableaux = somme_tableaux + TABLEAU_A[i];
		}

		for (int i = 0; i < TABLEAU_B.length; i++) {
			somme_tableaux = somme_tableaux + TABLEAU_B[i];
		}

		System.out.format("La somme des tableaux A et B est de %d.", somme_tableaux);
	}

	/**
	 * Moyenne tableau A et B.
	 */
	private static void MoyenneTableauAetB() {
		int somme_tableaux = 0;
		for (int i = 0; i < TABLEAU_A.length; i++) {
			somme_tableaux = somme_tableaux + TABLEAU_A[i];
		}

		for (int i = 0; i < TABLEAU_B.length; i++) {
			somme_tableaux = somme_tableaux + TABLEAU_B[i];
		}

		// on calcule le nombre d'items
		int nb_items_tableaux = TABLEAU_A.length + TABLEAU_B.length;

		// on calcul la moyenne en divisant la somme par le nombre d'items
		float valeur_moyenne = somme_tableaux / (float) nb_items_tableaux;

		System.out.format("La moyenne des tableaux A et B est de %f.", valeur_moyenne);
	}

	/**
	 * Minimum et maximum du tableau A.
	 */
	private static void MinMaxTableauA() {
		int plus_petite_valeur = Integer.MAX_VALUE;
		int plus_grande_valeur = 0;

		
		// ici on travaille directement avec le tableau A plutôt que de le passer en paramètre
		// Ce n'est pas idéal mais je voulais simplement vous montrer plusieurs façons de faire!
		for (int i = 0; i < TABLEAU_A.length; i++) {
			if (TABLEAU_A[i] > plus_grande_valeur) {
				plus_grande_valeur = TABLEAU_A[i];
			}

			if (TABLEAU_A[i] < plus_petite_valeur) {
				plus_petite_valeur = TABLEAU_A[i];
			}
		}

		System.out.format("La valeur maximale du tableau A est de %d et la valeur minimale de %d.", plus_grande_valeur,
				plus_petite_valeur);
	}

}
