
public class Rectangle {
	private int hauteur;
	
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) throws ArithmeticException {
		if(largeur < 0) {
			throw new ArithmeticException("Ceci est une valeur invalide!");
		}

		this.largeur = largeur;
	}
	private int largeur;
	
	public int getAire() {
		return hauteur*largeur;
	}
	
}
