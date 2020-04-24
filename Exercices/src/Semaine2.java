import java.text.NumberFormat;
import java.time.YearMonth;
import java.util.Locale;
import java.util.Scanner;

/**
 * The Class Semaine2.
 * Auteur: David Brouillette
 */
public class Semaine2 {
	
	/** The Constant TAUX_PRIME. */
	private final static float TAUX_PRIME = 0.1f;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
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
		case 8: 
			Statistiques3Nombre(scan);
			break;
		case 9:
			PrixDuHamburger(scan);
			break;
		case 10:
			CalculDeCote(scan);
			break;

		case 11:
			AdmissibiliteExamen(scan);
			break;
		case 12:
			AdmissibiliteExamen2(scan);
			break;
		case 13:
			InformationSurNombre(scan);
			break;
		case 14:
			VoyelleOuConsonne(scan);
			break;
		case 15:
			StatistiquesAuto(scan);
			break;
		case 16:
			CalculNombrePots(scan);
			break;
		case 17:
			RochePapierCiseau(scan);
			break;
		case 18:
			NombrePremier(scan);
			break;
		case 19:
			NombreDeJoursParMois(scan);
			break;
		case 20:
			NombreDeJoursParMoisInfaillible(scan);
			break;
		default:
			System.out.println("Mauvais choix!");
			break;
		}
		
		// fermeture du scanner
		scan.close();
	}

	
	/**
	 * Question 1.
	 *
	 * @param scan the scan
	 */
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
	

	/**
	 * Question 2.
	 *
	 * @param scan the scan
	 */
	public static void Question2(Scanner scan) {
		//Faire un programme permettant de calculer la moyenne des 3 nombres donnés.
		int nombre1 = 10, nombre2 = 15, nombre3 = 20;
		System.out.println("nombre1 = " + nombre1 + " nombre2 = " + nombre2 + ", nombre3 = " + nombre3);
		System.out.println("Résultat= " + (nombre1+nombre2+nombre3)/3);
	}


	/**
	 * Question 3.
	 *
	 * @param scan the scan
	 */
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

	
	/**
	 * Question 4.
	 *
	 * @param scan the scan
	 */
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

	/**
	 * Question 5 mois francais.
	 *
	 * @param scan the scan
	 * @param numero_mois the numero mois
	 */
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

	/**
	 * Question 6 mois anglais.
	 *
	 * @param scan the scan
	 * @param numero_mois the numero mois
	 */
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

	
	
	/**
	 * Maximum d'un nombre.
	 *
	 * @param scan the scan
	 */
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

	
	
	/**
	 * Statistiques de 3 nombres.
	 *
	 * @param scan the scan
	 */
	public static void Statistiques3Nombre(Scanner scan) {
		/*
		  Faire un programme permettant de calculer la somme et la moyenne des 3 nombres présentés.
		  Vous devez avec des instructions simples. 
		  Interdiction d’utiliser les fonctions mathématique Math.* pour y arriver.
		*/
		System.out.print("Nombre 1: ");
		int nombre1 = Integer.parseInt(scan.nextLine());

		System.out.print("Nombre 2: ");
		int nombre2 = Integer.parseInt(scan.nextLine());

		System.out.print("Nombre 3: ");
		int nombre3 = Integer.parseInt(scan.nextLine());
		
		
		
		int somme = nombre1 + nombre2 + nombre3; // calcul de la somme
		double moyenne = (nombre1+nombre2+nombre3)/3; // calcul de la moyenne

		// affichage du resultat		
		System.out.println("La somme est " + somme + " et la moyenne est " + moyenne);
	}
	
	/**
	 * Prix du hamburger.
	 *
	 * @param scan the scan
	 */
	public static void PrixDuHamburger(Scanner scan) {

		/*
		 * Faire un programme permettant de calculer le prix du hamburger en fonction de
		 * l'âge du participant et de la grille suivante:
		 * 
		 * Moins de 15 ans 1$ 
		 * 15 à 35 ans 2$ 
		 * 35 à 55 ans 3$ 
		 * 55 ans et + 1$
		 */
		
		System.out.print("Bonjour et bienvenue chez Ashton, quel est votre age?: ");
		int age = Integer.parseInt(scan.nextLine());
		double prix_hamburger;
		if(age < 15) {
			prix_hamburger = 1.0;
		}else if(age < 35) {
			prix_hamburger = 2.0;
		}else if(age < 55) {
			prix_hamburger = 3.0;
		}else{
			prix_hamburger = 1.0;				
		}
	
		System.out.println("Le prix du hamburger est de " +
								NumberFormat.getCurrencyInstance(new Locale("fr", "CA"))
								.format(prix_hamburger));
	}



	/**
	 * Calcul de cote.
	 *
	 * @param scan the scan
	 */
	public static void CalculDeCote(Scanner scan) {

		/*
		 * Faire un programme permettant d’attribuer une cote en fonction de la note
		 * entrée par l’étudiant:
		 * 
		 * Cote Moins de 60 E 
		 * 60 à 70 D- 
		 * 70 à 75 D 7
		 * 5 à 80 D+ 
		 * 80 à 85 C 
		 * 85 à 90 B 
		 * 90 à 95 A 
		 * 95 et + A+
		 */
		
		System.out.print("Quelle est la valeur de la note? ");
		double note = Double.parseDouble(scan.nextLine());
		String cote = "";
		if(note < 60) {
			cote = "E";
		}else if(note < 70) {
			cote = "D-";
		}else if(note < 75) {
			cote = "D";
		}else if(note < 80) {
			cote = "D+";
		}else if(note < 85) {
			cote = "C";
		}else if(note < 90) {
			cote = "B";
		}else if(note < 95) {
			cote = "A";
		}else{
			cote = "A+";				
		}
	
		System.out.println("Votre cote est: " + cote);
	}

	
	/**
	 * Admissibilite à un examen.
	 *
	 * @param scan the scan
	 */
	public static void AdmissibiliteExamen(Scanner scan) {
		/*
		 * Faire un programme permettant de valider si un étudiant est admissible à l’examen synthèse.
		 * Pour savoir si l’examen est admissible à l’examen synthèse, il doit avoir réussi l’examen 1 et l’examen 2.
		 */
		System.out.print("Quelle est la valeur de la note du premier examen? ");
		double note_examen1 = Double.parseDouble(scan.nextLine());

		System.out.print("Quelle est la valeur de la note du second examen? ");
		double note_examen2 = Double.parseDouble(scan.nextLine());
		
	
		// validation de l'admissibilité
		if(note_examen1 < 60 && note_examen2 < 60) {
			System.out.println("Malheureusement, vous n’êtes pas admissible à l’examen.");	
		}else {
			System.out.println("Bravo! Vous êtes admissible à l’examen.");	
		}
		
	}

	
	/**
	 * Admissibilite à un examen 2.
	 *
	 * @param scan the scan
	 */
	public static void AdmissibiliteExamen2(Scanner scan) {
		/*
		 * Faire un programme permettant de valider si un étudiant est admissible à l’examen synthèse.
		 * Pour savoir si l’examen est admissible à l’examen synthèse, 
		 * il doit avoir réussi l’examen 1,l’examen 2, l’examen 3 ou l’examen 4.
		 */
		System.out.print("Quelle est la valeur de la note du premier examen? ");
		float note_examen1 = Float.parseFloat(scan.nextLine());

		System.out.print("Quelle est la valeur de la note du second examen? ");
		float note_examen2 = Float.parseFloat(scan.nextLine());
		
		System.out.print("Quelle est la valeur de la note du troisième examen? ");
		float note_examen3 = Float.parseFloat(scan.nextLine());

		System.out.print("Quelle est la valeur de la note du quatrième examen? ");
		float note_examen4 = Float.parseFloat(scan.nextLine());

		// validation de l'admissibilité
		if(note_examen1 >= 60 || note_examen2 >= 60 || note_examen3 >= 60 || note_examen4 >= 60) {
			System.out.println("Bravo! Vous êtes admissible à l’examen.");	
		}else {
			System.out.println("Malheureusement, vous n’êtes pas admissible à l’examen.");	
		}
		float moyenne_cumulative = (note_examen1 + note_examen2 + note_examen3 + note_examen4)/4; 
	}

	
	
	/**
	 * Information sur un nombre.
	 *
	 * @param scan the scan
	 */
	public static void InformationSurNombre(Scanner scan) {
		/*
		 * Écrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro 
		 * et s'il est pair ou impair.
		 */
		System.out.print("Bonjour et bienvenue chez Ashton, quel est votre nombre?: ");
		int nombre = Integer.parseInt(scan.nextLine());

		// validation du pair ou impair
		String pair_ou_impair = "";
		if((nombre % 2) == 0) {
			pair_ou_impair = "pair";
		}else {
			pair_ou_impair = "impair";
		}
		
		// validation du positif/negatif/zero
		String style_nombre = "";
		if(nombre > 0) {
			style_nombre = "positif";
		}else if(nombre < 0) {
			style_nombre = "negatif";
		}else {
			style_nombre = "zéro";
		}
		
		System.out.println("Le nombre est " + style_nombre + " et il est (" + pair_ou_impair + ")");
		
	}

	/**
	 * Voyelle ou consonne?.
	 *
	 * @param scan the scan
	 */
	public static void VoyelleOuConsonne(Scanner scan) {
		/*
		 * Faire un programme qui lit un caractère et qui permet d’identifier s’il s’agit d’une consonne 
		 * ou d’une voyelle. Votre programme doit également détecter lorsqu’un chiffre est passé au programme.
		 */
		System.out.print("Bonjour et bienvenue chez Ashton, quel est votre lettre aujourd'hui?: ");
		char caractere = scan.nextLine().charAt(0);
		String chiffres = "1234567890";
		String voyelles = "aeiouy";
		
		
		if(chiffres.indexOf(caractere) >= 0) {
			System.out.println("Ceci est un caractère!");
		}else {
			if(voyelles.indexOf(caractere) >= 0) {
				System.out.println("Ceci est une voyelle!");
			}else {
				System.out.println("Ceci est une consonne!");
			}
		}
		
	}
	
	/**
	 * Statistiques automobile.
	 *
	 * @param scan the scan
	 */
	public static void StatistiquesAuto(Scanner scan) {
		/*
			Faire un programme posant les questions suivantes:

			Nombre de litres dans le réservoir
			La quantité de litres par 100km effectuée par l’automobile
			Le prix de l’essence au litre
			
			En fonction des variables données à votre programme, calculer:
			La distance pouvant être parcourue par votre véhicule
			Le coût pour voyager 250 kms.
		 */
		System.out.print("Bonjour et bienvenue chez CAA Québec, quel est le nombre de litres dans le réservoir?: ");
		float nb_litres = Float.parseFloat(scan.nextLine());

		System.out.print("La quantité de litres par 100km effectuée par l’automobile?: ");
		float qte_100km = Float.parseFloat(scan.nextLine());
		
		System.out.print("Indiquer le prix de l'essence?: ");
		float prix_essence = Float.parseFloat(scan.nextLine());

		float distance_parcourue = nb_litres / qte_100km * 100;
		float cout_km = (prix_essence/qte_100km) * 250;
		
		System.out.println("Résultat du calcul:");
		System.out.println("La distance pouvant être parcourue est par votre véhicule est " + String.format("%.2f km", distance_parcourue));
		System.out.println("Le coût pour voyager 250km est: " + NumberFormat.getCurrencyInstance(new Locale("fr", "CA"))
		.format(cout_km));
		
		float note_examen1 = Float.parseFloat(scan.nextLine());

		
	}
	
	
	/**
	 * Calcul nombre de pots.
	 *
	 * @param scan the scan
	 */
	public static void CalculNombrePots(Scanner scan) {
		/*
			Vous devez faire un programme qui devra calculer le nombre de pots de peinture à se procurer 
			en fonction de la couverture en pied² à couvrir. Un pot de peinture couvre 400 pieds carrés. 

			Si vous avez 600 pieds carré à couvrir, vous devrez en acheter 2 puisqu’on ne peut acheter un demi pot. 
			Si vous avez, 300 pieds carré, vous devrez en acheter 1, etc.

		 */
		System.out.print("Bonjour et bienvenue chez Peinture inc, quel est le nombre de pieds carré à couvrir?: ");
		int nb_pieds_carre = Integer.parseInt(scan.nextLine());
		
		int nb_pots = (int) Math.ceil(nb_pieds_carre/400d);
		System.out.print("Vous aurez besoin de " + nb_pots + " pot(s)");
	
	}
	
		
	/**
	 * Roche papier ciseau.
	 *
	 * @param scan the scan
	 */
	public static void RochePapierCiseau(Scanner scan) {
		/*
			Il se joue entre deux joueurs, en général avec les mains. Simultanément, les deux joueurs font un signe avec les mains qui représente soit une roche, soit des ciseaux, soit un papier.
			https://fr.wikipedia.org/wiki/Pierre-papier-ciseaux
			
			Nommons A et B les deux joueurs.
			
			Votre programme doit indiquer 1,2,3 et permettre de prendre le choix de l'utilisateur 1 et de l’utilisateur 2.
			
			Si les deux joueurs ont fait le même signe, on considère que c'est un cas d'égalité, aucun des deux joueurs ne marque un point.
			Si le joueur A a joué Caillou et le joueur B Ciseaux, A gagne car "le caillou émousse les ciseaux", et réciproquement.
			Si le joueur A a joué Papier et le joueur B Caillou, A gagne car "le papier enveloppe le caillou", et réciproquement.
			Si le joueur A a joué Ciseaux et le joueur B Papier, A gagne car "les ciseaux coupent le papier", et réciproquement.
		 */

		System.out.println("Bonjour et bienvenue dans Roche-Papier-Ciseaux");
		System.out.print("Veuillez inscrire le choix du joueur 1?\n"+
						 "1- Roche\n" + 
						 "2- Papier\n" + 
						 "3- Ciseaux\n");

		int joueur1 = Integer.parseInt(scan.nextLine());

		System.out.print("Veuillez inscrire le choix du joueur 2?\n"+
				 "1- Roche\n" + 
				 "2- Papier\n" + 
				 "3- Ciseaux\n");
		int joueur2 = Integer.parseInt(scan.nextLine());
		
		int resultat = (joueur1 + 3 - joueur2 ) % 3 ;
		
		 if (resultat == 0 ) {
		     System.out.println ("La partie est nulle!") ;
		 } else if (resultat == 1) {
		     System.out.println ("Le joueur 1 gagne!");
		 } else {
		     System.out.println ("Le joueur 2 gagne!");
		 }
	
	}
	
	/**
	 * Nombre premier.
	 *
	 * @param scan the scan
	 */
	public static void NombrePremier(Scanner scan) {
		
		/*
		 * Ecrire un algorithme, puis un programme en Java qui demande à l'utilisateur
		 * d'entrer un entier positif et qui détermine si ce nombre est premier ou non.
		 * 
		 * On dit qu'un nombre est premier si il a pour seuls diviseurs 1 et lui-même.
		 * Par ex : 2, 3, 5, 7, 11 sont premiers.
		 */
		
		
		System.out.print("Bonjour et bienvenue chez Mathématique inc, quel est votre nombre à vérifier?: ");
		int nombre = Integer.parseInt(scan.nextLine());

		boolean estNombrePremier = true;
        int i = 2;
		while(i < nombre && estNombrePremier == true) {
            if(nombre % i == 0)
            {
            	estNombrePremier = false;
            }
            i++;
        }

        String type_nombre = (estNombrePremier) ? "premier" : "pas un nombre premier";
    	System.out.format("Le nombre est %s.", type_nombre);
    	
    	
        
	}

	
	/**
	 * Nombre de jours par mois.
	 *
	 * @param scan the scan
	 */
	public static void NombreDeJoursParMois(Scanner scan) {
		/*
		 * Faire un programme permettant de déterminer le nombre de jours dans le mois
		 * en fonction du mois et de l’année. Attention, votre programme doit tenir
		 * compte d’une année bisextile ou non.
		 */

		System.out.print("Inscrire le mois: ");
		int mois = Integer.parseInt(scan.nextLine());

		System.out.print("Inscrire l'année: ");
		int annee = Integer.parseInt(scan.nextLine());
		
		boolean estAnneeBisextile;
		if (annee % 4 != 0) {
			estAnneeBisextile = false;
		  } else if (annee % 400 == 0) {
			  estAnneeBisextile = true;
		  } else if (annee % 100 == 0) {
		    estAnneeBisextile = false;
		  } else {
			  estAnneeBisextile = true;
		  }		
		
		int nbJours = 0;
		if(mois ==2) {
			if(estAnneeBisextile == true) {
				nbJours = 29;
			}else {
				nbJours = 28;
			}
		}else if(mois == 4 || mois == 6 || mois == 9 || mois == 11) {
				nbJours = 30;
		}else {
			nbJours = 31;
		}
		
		System.out.format("Le nombre de jour est de %d jours.", nbJours);
	}

	/**
	 * Nombre de jours par mois (version infaillible).
	 *
	 * @param scan the scan
	 */
	public static void NombreDeJoursParMoisInfaillible(Scanner scan) {
		System.out.print("Inscrire le mois: ");
		int mois = Integer.parseInt(scan.nextLine());

		System.out.print("Inscrire l'année: ");
		int annee = Integer.parseInt(scan.nextLine());
		
		java.time.YearMonth calendrier = YearMonth.of(annee, mois);
		System.out.format("Le nombre de jour est de %d jours.", calendrier.lengthOfMonth());
		

	}

	
	
}
