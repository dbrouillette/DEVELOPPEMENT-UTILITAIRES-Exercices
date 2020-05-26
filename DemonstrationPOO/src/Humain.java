
public class Humain {
 private String nom;
 private int age;
 private double nas;
 
 
 
 
 public int getAge() {
	 return age;
 }
 
 public void setAge(int p_age) {
	 System.out.format("L'age a été modifiée de %d à %d.", age, p_age);
	 age = p_age;
	 nas = Math.random() * 1000000;
	 
 }
 
 
 public Humain(String p_prenom, String p_nom, int p_age) {
	 setNom(p_prenom + ", " + p_nom);
	 age = p_age;
	 
	 nas = Math.random() * 1000000;
	 
 }
 
 public Humain(String p_nom, int p_age) {
	 setNom(p_nom);
	 age = p_age;
	 
	 nas = Math.random() * 1000000;
 }

 public Humain(String p_nom, int p_age, double p_nas) {
	 setNom(p_nom);
	 age = p_age;
	 
	 nas = p_nas;
 }

 
 
 public void presentationHumain() {
		System.out.format("Mon nom est : %s et mon age est %d et mon N.A.S. est %f.\n", getNom(), age, getNas());
 }
 
 
 public boolean estAdulte() {
	 if(age >=18) {
		 return true;
	 }else {
		 return false;
	 }
 }

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getNas() {
	return nas;
}
 
}
