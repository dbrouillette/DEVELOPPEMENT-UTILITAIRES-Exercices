
public class Cercle {
		private int rayon;
		private String nom;
		
		public Cercle(String p_nom, int p_rayon) {
			setRayon(p_rayon);
			setNom(p_nom);
		}
		
		public double getAire() {
			return (Math.PI * (getRayon()*getRayon())); 
		}
		
		public double getDiametre(){
			return 2*getRayon();
		}
		
		public double getCirconference(){
			return 2*Math.PI*getRayon();
		}
		
		public String toString() {
			return String.format("%s - Rayon: %d, Diametre: %.2f, Aire: %.2f, Circonference: %.2f",getNom(), getRayon(), getDiametre(), getAire(), getCirconference());
		}

		public int getRayon() {
			return rayon;
		}

		public void setRayon(int rayon) {
			this.rayon = rayon;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

}
