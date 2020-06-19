import java.time.LocalDate;

public class Eleve {
	private String nom;
	private String prenom;
	private LocalDate date_de_naissance;

	public Eleve(String p_prenom, String p_nom, LocalDate p_date_de_naissance) {
		setPrenom(p_prenom);
		setNom(p_nom);
		setDate_de_naissance(p_date_de_naissance);
	}
	
	
	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public String getNomComplet() {
		return getPrenom() + " " + getNom();
	}

	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
