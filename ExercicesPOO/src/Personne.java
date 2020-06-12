
public class Personne {
	public enum Genres {
		GARCON,
		FILLE
	}
	private final static int AGE_MINIMAL_ADULTE = 18;
	
	
	private String nom;
	private String prenom;
	private int age;
	private Genres genre;
	
	public Personne(String p_prenom, String p_nom, int p_age, Genres p_genre) {
		setPrenom(p_prenom);
		setNom(p_nom);
		setAge(p_age);
		setGenre(p_genre);
	}

	public boolean estUnAdulte() {
		return (getAge() >= AGE_MINIMAL_ADULTE);
	}


	public boolean estUneFille() {
		return (getGenre() == Genres.FILLE);
	}

	private String getNomGenre() {
		switch(getGenre()) {
		case GARCON:
			return "GARS";
		case FILLE:
			return "FILLE";
		default:
			return "INCONNU";
		}
	}

	private String estUnAdulteOuiNon() {
		if(estUnAdulte()) {
			return "Oui";
		}else {
			return "Non";
		}
	}

	
	
	public boolean estUnGarcon() {
		return (getGenre() == Genres.GARCON);
	}

	public String toString() {
		return String.format("Nom: %s, Age: %d, Sexe: %s, Adulte: %s", getNom(), getAge(), getNomGenre(), estUnAdulteOuiNon());
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Genres getGenre() {
		return genre;
	}
	public void setGenre(Genres genre) {
		this.genre = genre;
	}
}
