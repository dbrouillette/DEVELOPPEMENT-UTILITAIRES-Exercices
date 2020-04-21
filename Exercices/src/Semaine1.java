
public class Semaine1 {
	public static void main(String[] args) {

//		Écrire un programme java permettant d’inscrire “Bonjour la terre” et votre prénom la ligne suivante. Lancer le programme et vérifier afin de voir si ça fonctionne.
		System.out.println("Bonjour la terre!");
		System.out.println("votre prénom");

//		Écrire un programme permettant de calculer la somme de 21+34 et affichant la valeur de retour.
		int somme = 21 + 34;
		System.out.println("La somme est " + somme);
		
		
//		Écrire un programme permettant de calculer le résultat de 63/4 et affichant 	la valeur de la division à l’écran.
		double resultat = 63d/4d;
		System.out.println("Le résultat est " + resultat);

//		Écrire un programme permettant d’afficher le texte suivant:
		String texte_java =   "     J         A       V     V     A\n"
					 		+ "     J        A A       V   V     A A\n"
					 		+ "  J  J       AAAAA       V V     AAAAA\n"
					 		+ "   JJ       A     A       V     A    AA\n";

		System.out.println(texte_java);
		
		
//		Écrire un programme permettant d’afficher la ligne suivante ainsi que son 	résultat:
		System.out.println("(10.4*2.5-3)/(2+(2*2))");
		double resultat_calcul = (10.4d*2.5d-3d)/(2d+(2d*2d));
		System.out.println("Résultat: " + resultat_calcul);

		//		Écrire un programme permettant de calculer l’aire ainsi que le périmètre d’un cercle à partir de différentes valeurs.
		double rayon = 7.5d;
		double resultat_perimetre = (2 * Math.PI * rayon);
		double resultat_aire = Math.pow(rayon,rayon) * Math.PI;
		System.out.println("Périmèetre= " + resultat_aire + " Aire= " + resultat_aire);
		
//		Écrire un programme permettant d’afficher le résultat des opérations suivantes:
//		a. -5 + 8 * 6
		int calcul1 = (-5 + 8*6);
		System.out.println("-5 + 8 * 6=" + calcul1);
		
//		b. (55+9) % 9
		int calcul2 = (55+9) % 9;
		System.out.println("(55+9) % 9=" + calcul2);

		//		c. 20 + -3*5 / 8
		double calcul3 = 20 + ((-3*5) / 8);
		System.out.println("20 + ((-3*5) / 8)=" + calcul3);
		
//		d. 5 + 15 / 3 * 2 - 8 % 3
		double calcul4 = 5 + ((15 / 3) * 2) - (8 % 3);
		System.out.println("5 + ((15 / 3) * 2) - (8 % 3)=" + calcul4);

//		Exercices supplémentaires:
//		Écrire un programme permettant de dessiner le drapeau canadien lorsque vous le lancez.
		System.out.println("Oh Canada....");
		System.out.println("");
		System.out.println("");
		
		String drapeau = 	"-------------------------------------------------------------------\n" +
						 	"XWXWXWXWXWXWXWXW                                   WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX                 A                 XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW                AWA                WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX           AA  AWXWA  AA           XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW            VWXWXWXWXWV            WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX        AA   VWXWXWXWV   AA        XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW    VWXWXWXA  VWXWXWV  AXWXWXWV    WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX     XWXWXWXWXWXWXWXWXWXWXWXWX     XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW   AXWXWXWXWXWXWXWXWXWXWXWXWXWXA   WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX      VXWXWXWXWXWXWXWXWXWXWXV      XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW         VXWXWXWXWXWXWXWXV         WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX           XWXWXWXWXWXWX           XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW         AXWXWXWXWXWXWXWXA         WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX                 I                 XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW                 I                 WXWXWXWXWXWXWXWX\n" +
						 	"WXWXWXWXWXWXWXWX                 I                 XWXWXWXWXWXWXWXW\n" +
						 	"XWXWXWXWXWXWXWXW                                   WXWXWXWXWXWXWXWX\n"  +
						 	"-------------------------------------------------------------------";
		System.out.println(drapeau);
		
		// Écrire un programme permettant de trouver le périmètre ainsi que l’aire
		//d’un hexagone après avoir donné la taille d’un des côtés de l’hexagone.
		double cote_hexagone = 4;
		double resultat_perimetre_hexagone = cote_hexagone * 6;
		double resultat_aire_hexagone = ((3*Math.sqrt(3))/2) * Math.pow(cote_hexagone, 2);

		// version longue
		System.out.println("Périmètre= " + resultat_perimetre_hexagone + " Aire= " + resultat_aire_hexagone);
		
		
		// version avec formattage du nombre de décimale...
		System.out.println("Périmètre= " + resultat_perimetre_hexagone + " Aire= " + String.format("%.2f", resultat_aire_hexagone));
		
	}
}
