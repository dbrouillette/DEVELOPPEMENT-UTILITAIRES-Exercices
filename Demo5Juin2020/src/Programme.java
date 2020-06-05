import java.util.ArrayList;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personnage sylvie = new PersonnagePrincesse();
		sylvie.setNom("ici c'est sylvie!");
		
		
		
		Personnage bowser = new PersonnageBowser();
		bowser.setNom("bowser's here!");
		
		
		ArrayList<Personnage> ma_liste = new ArrayList();
		ma_liste.add(sylvie);
		ma_liste.add(bowser);
		
		
		for(int i =0;i<ma_liste.size(); i++) {
			Personnage personnage_en_cours = ma_liste.get(i);
			System.out.format("Mon nom est %s", personnage_en_cours.getNom());

			personnage_en_cours.sauter();
			
			System.out.println("---------------------------------------------------");
			
		}
		
		
		Humain humain1 = new Humain();
		humain1.nom = "David";
		humain1.Age = 19;
		
		Humain humain2 = new Humain();
		humain2.nom = "Josette";
		humain2.Age = 19;
		
		
		
		Voiture voiture1 = new Voiture();
		voiture1.marque = "Mazda";
		voiture1.modele = "Mazda3";
		voiture1.proprietaire = humain1;
		
				
		System.out.println("Le proprietaire de la voiture " + voiture1.modele + " est " + voiture1.proprietaire.nom);
		
		
		ArrayList liste_des_humains = new ArrayList();
		liste_des_humains.add(humain1);
		liste_des_humains.add(humain2);
		
		System.out.println("La liste contient " + liste_des_humains.size() + " éléments!");
		
		for(int i = 0; i<liste_des_humains.size(); i++) {
			Humain humain_courant = (Humain) liste_des_humains.get(i);
			
			System.out.println(humain_courant.nom);
			
		}
	}

}
