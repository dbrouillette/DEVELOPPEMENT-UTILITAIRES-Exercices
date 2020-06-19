
public class Rectangle {
	private String nom;
	private int hauteur;
	private int largeur;
	
	public Rectangle(String p_nom, int p_hauteur, int p_largeur) {
		setHauteur(p_hauteur);
		setLargeur(p_largeur);
		setNom(p_nom);
		
	}

	private int getHauteur() {
		return hauteur;
	}

	private void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public double getAire() {
		return ((getHauteur()*getLargeur())); 
	}
	
	public double getPerimetre(){
		return (2*getHauteur()) + (2*getLargeur());
	}
	
	public double getCirconference() throws Exception{
		throw new Exception("Opération impossible, un rectangle n'a aucune circonférence!");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return String.format("%s - Hauteur: %d, Largeur: %d, Perimetre: %.2f, Aire: %.2f",getNom(), getHauteur(), getLargeur(), getPerimetre(), getAire());
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	

}
