
public class Animal {
 private String nom;
 private String type;

 public Animal(String p_type, String p_nom) {
	 setNom(p_nom);
	 setType(p_type);
 }
 
 public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getType() {
	return type;
}

public String toString() {
	return String.format("Type: %s, Nom: %s", getType(), getNom());
}




public void setType(String genre) {
	this.type = genre;
}
 

 
}
