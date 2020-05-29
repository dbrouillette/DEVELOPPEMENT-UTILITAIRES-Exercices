
public class Pneu {
  private float usure_pneu = 0;
  
  private Valve la_valve;
  
  
  public boolean estAChanger() {
	  if(getUsure_pneu() > 0.9) {
		  return true;
	  }else {
		  return false;
	  }
  }

public float getUsure_pneu() {
	return usure_pneu;
}

public void setUsure_pneu(float usure_pneu) {
	this.usure_pneu = usure_pneu;
}

public Valve getLa_valve() {
	return la_valve;
}

public void setLa_valve(Valve la_valve) {
	this.la_valve = la_valve;
}
}
