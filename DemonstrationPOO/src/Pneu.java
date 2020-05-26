
public class Pneu {
	private int hauteur;
	private String marque;

	
	public Pneu(int p_hauteur, String p_marque) {
		setHauteur(p_hauteur);
		setMarque(p_marque);
	}
	
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
}
