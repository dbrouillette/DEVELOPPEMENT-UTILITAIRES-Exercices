import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercices {

	public static void main(String[] args) {
		//Question1();
		//Question2();
		Question3();
		Question4();
		Question5();		
		Question7();
		Question11();
	}

	
	public static void Question1() {
		// création de l'enseignant
		Enseignant enseignant_programmation = new Enseignant("Brouillette", "David", 12344);

		// création du cours et attribution de l'enseignant via le constructeur
		Cours cours_programmation = new Cours("Développement d'utilitaire","PROG101",105, enseignant_programmation);

		// création des élèves et ajout à la liste d'élève du cours créé précédemment...		
		Eleve eleve = new Eleve("Benoit", "Laquerre", LocalDate.of(1998,Month.JANUARY,21));
		cours_programmation.getListe_eleve().add(eleve);

		Eleve autre_eleve = new Eleve("Benoit", "Riopel", LocalDate.of(1982,Month.APRIL,21));
		cours_programmation.getListe_eleve().add(autre_eleve);
		
		
		for(Eleve eleve_courant : cours_programmation.getListe_eleve()) {
			System.out.format("%s suit présentement le cours [%s] avec le meilleur prof nommé %s. \n", eleve_courant.getNomComplet(), cours_programmation.getNom(), cours_programmation.getEnseignant().getNom());
		}
	}
	
	public static void Question2() {
		Cercle cercle1 = new Cercle("Cercle 1",3);
		Cercle cercle2 = new Cercle("Cercle 2",4);
		Cercle cercle3 = new Cercle("Cercle 3",5);
		
		System.out.println(cercle1.toString());
		System.out.println(cercle2.toString());
		System.out.println(cercle2.toString());
		
	}

	public static void Question3() {
		Carre carre1 = new Carre("Carré 1",3);
		Carre carre2 = new Carre("Carré 2",4);
		Carre carre3 = new Carre("Carré 3",5);
		
		System.out.println(carre1.toString());
		System.out.println(carre2.toString());
		System.out.println(carre3.toString());
		
	}

	public static void Question4() {
		Rectangle rectangle1 = new Rectangle("Rectangle 1",3,2);
		Rectangle rectangle2 = new Rectangle("Rectangle 2",4,3);
		Rectangle rectangle3 = new Rectangle("Rectangle 3",5,4);
		
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		System.out.println(rectangle3.toString());
		
	}

	public static void Question5() {
		Triangle triangle1 = new Triangle("Triangle #1",3,2);
		Triangle triangle2 = new Triangle("Triangle #2",4,3);
		Triangle triangle3 = new Triangle("Triangle #3",5,4);
		
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		System.out.println(triangle3.toString());
		
	}

	public static void Question7() {
		Personne benoit = new Personne("Benoit", "Laprise", 22, Personne.Genres.GARCON);
		Personne gisele = new Personne("Gisèle", "Comtois", 59, Personne.Genres.FILLE);
		Personne tim = new Personne("Tim", "Rondeau", 14, Personne.Genres.GARCON);
		Personne gary = new Personne("Gary", "Fraser", 31, Personne.Genres.GARCON);
		
		ArrayList<Personne> liste_personne = new ArrayList<Personne>();
		liste_personne.add(benoit);
		liste_personne.add(gisele);
		liste_personne.add(tim);
		liste_personne.add(gary);
		
		// affichage des personnes (toute la liste), avec un for régulier
		for(int i = 0; i< liste_personne.size(); i++) {
			Personne personne_courant = liste_personne.get(i);
			if(personne_courant.estUnAdulte()) {
				// ici, puisqu'on a fait une méthode toString(), nous n'avons pas besoin de le réécrire, c'est toujours implicite
				System.out.println(personne_courant);
			}
		}

		
		// question 8 (avec un for régulier)
		for(int i = 0; i< liste_personne.size(); i++) {
			Personne personne_courant = liste_personne.get(i);
			if(personne_courant.estUnAdulte()) {
				// ici, puisqu'on a fait une méthode toString(), nous n'avons pas besoin de le réécrire, c'est toujours implicite
				System.out.println(personne_courant);
			}
		}
		
		
		// question 9 (avec un for each)
		for(Personne personne_courant : liste_personne) {
			if(personne_courant.estUneFille()) {
				// ici, puisqu'on a fait une méthode toString(), nous n'avons pas besoin de le réécrire, c'est toujours implicite
				System.out.println(personne_courant);
			}
		}

		// question 10 (avec un for each)
		int nb_gars =0, nb_filles=0;
		for(Personne personne_courant : liste_personne) {
			if(personne_courant.estUneFille()) {
				nb_filles++;
			}else {
				nb_gars++;
			}
		}	
		System.out.format("Il y a %d filles, %d garçons pour un total de %d personnes. \n", nb_filles, nb_gars, nb_gars+nb_filles);
	}
	
	public static void Question11() {
		Scanner scan = new Scanner(System.in);
		boolean desire_continuer = true;

		// définition de la liste avant de partir...
		ArrayList<Animal> liste_animal = new ArrayList<Animal>();
		
		// faire... tant qu'on désire continuer...
		do {

			System.out.println("Quel est le type de l'animal?");
			String type_animal = scan.nextLine().trim();
			System.out.println("Quel est le nom de l'animal?");
			String nom_animal = scan.nextLine().trim();
			
			Animal nouvel_animal = new Animal(type_animal, nom_animal);
			liste_animal.add(nouvel_animal);
			
			System.out.println("Désirez-vous continuer (O/N)?");
			if(scan.nextLine().toUpperCase().contentEquals("O")) {
				desire_continuer = true;
			}else {
				desire_continuer = false;
			}
		}while(desire_continuer == true);
		
		System.out.format("Voici le sommaire! La liste contient %d animaux! \n", liste_animal.size());
		
		// affichage de la liste avec un for each, 
		// et en utilisant la méthode toString() qui et implicite si elle a été programmée!
		for(Animal animal_courant : liste_animal) {
			System.out.println(animal_courant);
		}
		
		// ici puisqu'il s'agit d'un affichage simple et qu'on a fait un toString() sur les éléments de la liste, 
		// on peut simplement donner l'objet array list, et l'itération se fera directement..
		System.out.println(liste_animal);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Liste des animaux par types");
		
	    HashMap<String, ArrayList<Animal>> map = new HashMap<String, ArrayList<Animal>>();

		for(Animal animal_courant : liste_animal) {
	        // si le type n'existe pas dans le hashmap, on créé une nouvelle liste pour ce type
			// et on ajoute cette liste pour ce type dans le hashmap
	        if(map.containsKey(animal_courant.getType()) == false) {
	            ArrayList<Animal> liste_de_ce_type = new ArrayList<Animal>();
	            liste_de_ce_type.add(animal_courant);
	            map.put(animal_courant.getType(), liste_de_ce_type);
	        } else {
	            // si le type est déjà dans la liste, on récupère simplement le arraylist existant pour cette liste
	        	// et on l'ajoute dedans
	           ArrayList<Animal> liste_de_ce_type = map.get(animal_courant.getType());
	           liste_de_ce_type.add(animal_courant);
	        }
	    }
		
		// voici la méthode pour parcourir une liste de type hash map
		for(Entry<String, ArrayList<Animal>> liste_animaux_categorise : map.entrySet()) {
			// la clé est le type de l'animal qu'on avait stocké... on peut aller la chercher avec getKey();
			String nom_du_type = liste_animaux_categorise.getKey();

			// la valeur la liste des animaux qu'on avait stocké pour cette clé... on peut aller la chercher avec getvalue();
			ArrayList<Animal> liste_animal_de_ce_type = liste_animaux_categorise.getValue(); 

			
			// affichage du résumé de la liste
			System.out.format("Type: %s - Nombre: %d animaux! \n", nom_du_type, liste_animal_de_ce_type.size());
			for(Animal animal : liste_animal_de_ce_type) {
				System.out.format(" - Nom de l'animal: %s \n", animal.getNom());
			}
		}
	}
	
}
