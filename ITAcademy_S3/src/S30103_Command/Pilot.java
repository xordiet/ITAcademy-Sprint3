package S30103_Command;

import java.util.ArrayList;
import java.util.List;

public class Pilot {
	private List<Ordre> llistatOrdres = new ArrayList<Ordre>();
	
	public void rebreOrdre(Ordre ordre){
		llistatOrdres.add(ordre);
	}
	
	public void executaOrdres(){
		for (Ordre ordre : llistatOrdres) {
			ordre.executa();
		}
		llistatOrdres.clear();
	}

}
