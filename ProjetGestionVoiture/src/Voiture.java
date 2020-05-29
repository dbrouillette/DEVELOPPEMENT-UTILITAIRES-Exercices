
public class Voiture {
	private int nb_litres_essence;
	
	public Pneu AvantGauche;
	public Pneu AvantDroit;
	public Pneu ArriereGauche;
	public Pneu ArriereDroit;
	
	
	public final int NB_LITRES_MAXIMUM = 120;

	public String marque;
	
	public int getNb_litres_essence() {
		return nb_litres_essence;
	}

	public void faireLePlein() {
		this.nb_litres_essence = NB_LITRES_MAXIMUM;
	}
	
	
	public boolean doitFaireLePlein() {
		if(marque.contentEquals("toyota")) {
			if(nb_litres_essence < 15) {
				return true;
			}else {
				return false;
			}
		}else {
			if(nb_litres_essence < 10) {
				return true;
			}else {
				return false;
			}
		}
		
		
		
	}
	
	
	
	public static void Klaxonner() {
		System.out.println("Honk!");
	}

	public Pneu getAvantGauche() {
		return AvantGauche;
	}

	public void setAvantGauche(Pneu avantGauche) {
		AvantGauche = avantGauche;
	}

	public Pneu getAvantDroit() {
		return AvantDroit;
	}

	public void setAvantDroit(Pneu avantDroit) {
		AvantDroit = avantDroit;
	}

	public Pneu getArriereGauche() {
		return ArriereGauche;
	}

	public void setArriereGauche(Pneu arriereGauche) {
		ArriereGauche = arriereGauche;
	}

	public Pneu getArriereDroit() {
		return ArriereDroit;
	}

	public void setArriereDroit(Pneu arriereDroit) {
		ArriereDroit = arriereDroit;
	}
	
	
	public boolean possedeErreurPneu() {
		if(AvantDroit.estAChanger() == true || this.AvantGauche.estAChanger() == true || this.ArriereDroit.estAChanger() == true || this.ArriereGauche.estAChanger() == true) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
