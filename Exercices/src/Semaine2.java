import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// bonjour les amis!

public class Semaine2 {
	private final static float TAUX_PRIME = 0.1f;
	public static void main(String[] args) {
		int mois;
		
		// Initialisation du scanner
		Scanner scan = new Scanner(System.in);

		System.out.print("Veuillez inscrire la question à exécuter:");
		int choix = Integer.parseInt(scan.nextLine());
		switch(choix) {
		case 1: 
			Question1(scan);
			break;
		case 2: 
			Question2(scan);
			break;
		case 3: 
			Question3(scan);
			break;
		case 4: 
			Question4(scan);
			break;
		case 5: 
			System.out.print("Veuillez un numéro de mois:");
			mois = Integer.parseInt(scan.nextLine());
			Question5_Mois_Francais(scan, mois);
			break;
		case 6: 
			System.out.print("Veuillez inscrire un numéro de mois:");
			mois = Integer.parseInt(scan.nextLine());

			System.out.print("Bonjour, veuillez inscrire la langue (F ou A): ");
			String langue = scan.nextLine().toUpperCase().trim();
			if(langue.equals("F") == true) {
				Question5_Mois_Francais(scan, mois);
			}else {
				Question6_Mois_Anglais(scan, mois);
			}
			break;
		case 7: 
			MaximumNombre(scan);
			break;
		default:
			System.out.println("Mauvais choix!");
			break;
		}
		
		// fermeture du scanner
		scan.close();
	}

	
	public static void Question1(Scanner scan) {
		//Faire un programme permettant de calculer la prime du courtier d’assurance 
		//qui correspond à 10% des ventes réalisés
		System.out.print("Inscrire le montant des ventes: ");
		int ventes = Integer.parseInt(scan.nextLine());
		System.out.println("Le montant de la prime tel que vous l'avez probablement fait est de : " + (ventes * TAUX_PRIME));
		
		System.out.println("Le montant de la prime formatté automatiquement par JAVA serait de " 
							+ NumberFormat.getCurrencyInstance(new Locale("fr", "CA"))
							.format((ventes * TAUX_PRIME)));
	}
	

	public static void Question2(Scanner scan) {
		//Faire un programme permettant de calculer la moyenne des 3 nombres donnés.
		int nombre1 = 10, nombre2 = 15, nombre3 = 20;
		System.out.println("nombre1 = " + nombre1 + " nombre2 = " + nombre2 + ", nombre3 = " + nombre3);
		System.out.println("Résultat= " + (nombre1+nombre2+nombre3)/3);
	}


	public static void Question3(Scanner scan) {
		//Faire un programme permettant à partir de l'âge du participant, de le laisser passer 
		//ou si son âge est plus grand que 18 ans et de le refuser s’il s’agit d’un mineur.
		System.out.print("Bonjour, veuillez indiquer votre age s.v.p.: ");
		int age = Integer.parseInt(scan.nextLine());
		if(age >=18) {
			System.out.println("C'est bon, vous pouvez entrer!");
		}else {
			System.out.println("Malheureusement, vous ne pouvez entrer!");
		}
	}

	
	public static void Question4(Scanner scan) {
		/*
		 	Faire un programme permettant de calculer, à partir de l'âge du participant, le prix d’entré dans l’établissement. 
			Il doit laisser passer ou si son âge est plus grand que 18 ans et de le refuser s’il s’agit d’un mineur.
			De plus, s’il s’agit d’une femme, le coût du billet sera de 0$. S’il s’agit d’un homme, le coût sera de 10$.
		*/
		System.out.print("Bonjour, veuillez indiquer votre age s.v.p.: ");
		int age = Integer.parseInt(scan.nextLine());
		if(age >=18) {
			System.out.println("C'est bon, vous pouvez entrer!");
			System.out.print("Quelle est votre genre (M ou F): ");
			String genre = scan.nextLine();
			if(genre.trim().toUpperCase().equals("F") == true) {
				System.out.println("Bravo! C'est gratuit pour vous aujourd'hui!");
			}else {
				System.out.println("Le coût pour vous sera de 10$!");
			}
			
		}else {
			System.out.println("Malheureusement, vous ne pouvez entrer!");
		}
	}

	public static void Question5_Mois_Francais(Scanner scan, int numero_mois) {
		/*
			Faire un programme qui permet d’afficher le mois de naissance lorsque vous donnez la valeur numérique équivalente:
		*/

		String nom_mois = "";
		switch(numero_mois) {
		case 1:
			nom_mois = "janvier";
			break;
		case 2:
			nom_mois = "février";
			break;
		case 3:
			nom_mois = "mars";
			break;
		case 4:
			nom_mois = "avril";
			break;
		case 5:
			nom_mois = "mai";
			break;
		case 6:
			nom_mois = "juin";
			break;
		case 7:
			nom_mois = "juillet";
			break;
		case 8:
			nom_mois = "août";
			break;
		case 9:
			nom_mois = "septembre";
			break;
		case 10:
			nom_mois = "octobre";
			break;
		case 11:
			nom_mois = "novembre";
			break;
		case 12:
			nom_mois = "decembre";
			break;
		default:
				nom_mois = "Mois invalide!";
				break;
		}
		
		System.out.println(nom_mois);
	}

	public static void Question6_Mois_Anglais(Scanner scan, int numero_mois) {
		/*
			Faire un programme qui permet d’afficher un mois lorsque vous donnez la valeur numérique équivalente:
		*/

		String nom_mois = "";
		switch(numero_mois) {
		case 1:
			nom_mois = "january";
			break;
		case 2:
			nom_mois = "february";
			break;
		case 3:
			nom_mois = "march";
			break;
		case 4:
			nom_mois = "april";
			break;
		case 5:
			nom_mois = "may";
			break;
		case 6:
			nom_mois = "june";
			break;
		case 7:
			nom_mois = "july";
			break;
		case 8:
			nom_mois = "august";
			break;
		case 9:
			nom_mois = "september";
			break;
		case 10:
			nom_mois = "october";
			break;
		case 11:
			nom_mois = "november";
			break;
		case 12:
			nom_mois = "december";
			break;
		default:
				nom_mois = "Invalid month!";
				break;
		}
		
		System.out.println(nom_mois);

	}

	
	
	public static void MaximumNombre(Scanner scan) {
		//Faire un programme permettant de déterminer le plus grand nombre et le plus petit des 3 nombres présentés. 
		System.out.print("Nombre 1: ");
		int nombre1 = Integer.parseInt(scan.nextLine());

		System.out.print("Nombre 2: ");
		int nombre2 = Integer.parseInt(scan.nextLine());

		System.out.print("Nombre 3: ");
		int nombre3 = Integer.parseInt(scan.nextLine());
		
		
		// calcul du plus petit nombre...
		int plusPetitNombre = 0;
		if(nombre1 < nombre2 && nombre1 < nombre3) {
			plusPetitNombre = nombre1;
		}else {
			if(nombre2 < nombre1 && nombre2 < nombre3) {
				plusPetitNombre = nombre2;
			}else {
				plusPetitNombre = nombre3;
			}
			
		}

		// calcul du plus grand nombre...
		int plusGrandNombre = 0;
		if(nombre1 > nombre2 && nombre1 > nombre3) {
			plusGrandNombre = nombre1;
		}else {
			if(nombre2 > nombre1 && nombre2 > nombre3) {
				plusGrandNombre = nombre2;
			}else {
				plusGrandNombre = nombre3;
			}
		}

		System.out.println("Le plus petit nombre est " + plusPetitNombre + " et le plus grand nombre est " + plusGrandNombre);
	}
	

}
