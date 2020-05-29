
public class Siege {
	private String numero_siege;
	String[] sieges_sortie_secours = {"J01","J02","J03","P37"};
	
	public boolean estUneSortieDeSecours(){
		for(int i = 0; i<sieges_sortie_secours.length; i++) {
			if(sieges_sortie_secours[i].contentEquals(getNumero_siege())) {
				return true;
			}
		}
		
		return false;
	}

	public String getNumero_siege() {
		return numero_siege;
	}

	public void setNumero_siege(String numero_siege) {
		this.numero_siege = numero_siege;
	}
}
