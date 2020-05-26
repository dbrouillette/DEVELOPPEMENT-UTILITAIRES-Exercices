import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList tableau_dynamique = new ArrayList();
		
		
		
		Humain benoit = new Humain("Benoit", 11);
		Humain nicole = new Humain("Nicole", 11);
		Humain gamin1 = new Humain("Pierre", 11);
		Humain gamin2 = new Humain("Ti-Paul", 11);
	
//		Pneu pneu_importe = new Pneu(17, "Brigestone");
//		
//		
//		Voiture voiture_de_benoit = new Voiture("Mazda", "Mazda 2", 1999, benoit);
//		voiture_de_benoit.setPneuAD(pneu_importe);
//		voiture_de_benoit.setPneuAG(pneu_importe);
//		voiture_de_benoit.setPneuARD(pneu_importe);
//		voiture_de_benoit.setPneuARG(pneu_importe);
//		
//		
//		System.out.format("La voiture de marque %s et pour le modèle %s appartient à %s qui a un N.A.S. de %f.", 
//				voiture_de_benoit.getMarque(), 
//				voiture_de_benoit.getModele(), 
//				voiture_de_benoit.getConducteur().getNom(), 
//				voiture_de_benoit.getConducteur().getNas());
//		
//		
//		System.out.format("La voiture de benoit a un pneu avant droit de marque %s", voiture_de_benoit.getPneuAD().getMarque());
//		
//		voiture_de_benoit.numero_plaque = "ABC123";
//		
//		System.out.println("Le numéro de la plaque est" + voiture_de_benoit.numero_plaque);
//		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList liste_voiture = new ArrayList();
		
		String modele = "";
		String marque = "";
		int annee = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Inscrire le modèle");
			modele = scan.nextLine();
			
			System.out.println("Inscrire la marque");
			marque = scan.nextLine();
			
			System.out.println("Inscrire l'année");
			annee = Integer.parseInt(scan.nextLine());
			
			Voiture voiture = new Voiture(modele, marque, annee,nicole);
			liste_voiture.add(voiture);
		}
		
		
		// affichage des voitures
		for(int i = 0; i < liste_voiture.size(); i++) {
			Voiture voiture_courante = (Voiture)liste_voiture.get(i);
			
			System.out.println(voiture_courante.getMarque());
		}
		
	}

}
