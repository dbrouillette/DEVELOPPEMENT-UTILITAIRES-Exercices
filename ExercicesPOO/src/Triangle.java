
public class Triangle {
	private String nom;
	private int hauteur;
	private int largeur;
	
	public Triangle(String p_nom, int p_hauteur, int p_largeur) {
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
		return ((getHauteur()*getLargeur()))/2; 
	}
	
	public double getPerimetre(){
		return getLargeur() + getHauteur() + getHypotenuse();
	}
	
	public double getCirconference() throws Exception{
		throw new Exception("Opération impossible, un rectangle n'a aucune circonférence!");
	}

	
	public double getHypotenuse() {
		return Math.sqrt(Math.pow(getHauteur(), 2) + Math.pow(getLargeur(), 2));
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return String.format("%s - Hauteur: %d, Largeur: %d, Hypoténuse: %.2f, Perimetre: %.2f, Aire: %.2f",getNom(), getHauteur(), getLargeur(), getHypotenuse(), getPerimetre(), getAire());
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	

}
