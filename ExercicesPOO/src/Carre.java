
public class Carre {
	private String nom;
	private int hauteur;
	
	public Carre(String p_nom, int p_hauteur) {
		setHauteur(p_hauteur);
		setNom(p_nom);
	}

	private int getHauteur() {
		return hauteur;
	}

	private void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public double getAire() {
		return ((getHauteur()*getHauteur())); 
	}
	
	public double getPerimetre(){
		return 4*getHauteur();
	}
	
	public double getCirconference() throws Exception{
		throw new Exception("Opération impossible, un carré n'a aucune circonférence!");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return String.format("%s - Hauteur: %d, Perimetre: %.2f, Aire: %.2f",getNom(), getHauteur(), getPerimetre(), getAire());
	}

	
}
