
public class Voiture {
private String marque;
private String modele;
private int annee;

public String numero_plaque;

private Pneu PneuAG;
private Pneu PneuAD;
private Pneu PneuARG;
private Pneu PneuARD;





private Humain conducteur;



  public Voiture(String p_marque, String p_modele, int p_annee, Humain p_conducteur) {
	  setMarque(p_marque);
	  setModele(p_modele);
	  setAnnee(p_annee);
	  setConducteur(p_conducteur);
  }

  
  
  

public String getMarque() {
	return marque;
}


public void setMarque(String marque) {
	this.marque = marque;
}


public String getModele() {
	return modele;
}


public void setModele(String modele) {
	this.modele = modele;
}


public int getAnnee() {
	return annee;
}


public void setAnnee(int annee) {
	this.annee = annee;
}





public Humain getConducteur() {
	return conducteur;
}





public void setConducteur(Humain conducteur) {
	this.conducteur = conducteur;
}





public Pneu getPneuAG() {
	return PneuAG;
}





public void setPneuAG(Pneu pneuAG) {
	PneuAG = pneuAG;
}





public Pneu getPneuAD() {
	return PneuAD;
}





public void setPneuAD(Pneu pneuAD) {
	PneuAD = pneuAD;
}





public Pneu getPneuARG() {
	return PneuARG;
}





public void setPneuARG(Pneu pneuARG) {
	PneuARG = pneuARG;
}





public Pneu getPneuARD() {
	return PneuARD;
}





public void setPneuARD(Pneu pneuARD) {
	PneuARD = pneuARD;
}
}
