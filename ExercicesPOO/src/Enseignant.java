import java.util.Date;

public class Enseignant {
	private String nom;
	private String prenom;
	private int numero_employe;

	public Enseignant(String p_nom, String p_prenom, int p_numero_employe) {
		setNom(p_nom);
		setPrenom(p_prenom);
		setNumero_employe(p_numero_employe);
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getNumero_employe() {
		return numero_employe;
	}


	public void setNumero_employe(int numero_employe) {
		this.numero_employe = numero_employe;
	}

}
