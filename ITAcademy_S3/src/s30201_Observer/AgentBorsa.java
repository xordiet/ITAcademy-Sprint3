package s30201_Observer;

import java.util.ArrayList;
import java.util.List;

public class AgentBorsa {
	private List<Agencia> agencies = new ArrayList<Agencia>();
	private int estat;
	
	public int getEstat() {
		return estat;
	}
	public void setEstat(int estat) {
		this.estat = estat;
		notificaAgencies();
	}
	
	public void attach(Agencia agencia){
		agencies.add(agencia);		
	}
	
	public void notificaAgencies(){
	      for (Agencia agencia : agencies) {
	         agencia.update();
	      }
	   } 
	
}
