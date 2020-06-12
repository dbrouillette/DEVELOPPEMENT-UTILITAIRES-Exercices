import java.util.ArrayList;

public class Cours {
	private String nom;
	private String code_de_cours;
	private int duree;
	private Enseignant enseignant;
	private ArrayList<Eleve> liste_eleve;
	
	public Cours(String p_nom, String p_code_de_cours, int p_duree) {
		setNom(p_nom);
		setCode_de_cours(p_code_de_cours);
		setDuree(p_duree);
		
		liste_eleve = new ArrayList();
	}
	

	public Cours(String p_nom, String p_code_de_cours, int p_duree, Enseignant p_enseignant) {
		setNom(p_nom);
		setCode_de_cours(p_code_de_cours);
		setDuree(p_duree);
		setEnseignant(p_enseignant);
		
		liste_eleve = new ArrayList();

	}

	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode_de_cours() {
		return code_de_cours;
	}
	public void setCode_de_cours(String code_de_cours) {
		this.code_de_cours = code_de_cours;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public ArrayList<Eleve> getListe_eleve() {
		return liste_eleve;
	}
}
