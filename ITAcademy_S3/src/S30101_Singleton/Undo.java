package S30101_Singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	
	private List<String> historial = new ArrayList<>();
	
	//Creem el constructor com a privat perquè no pugui ser instanciat
	private Undo() { }
	
	//Creem una instància d'Undo
	private static Undo instancia = new Undo();
	
	//Recuperem la instància i així sempre treballem sobre la mateixa
	public static Undo getInstance(){
		return instancia;
	}
	
	public void afegir(String text) {
		historial.add(text);
	}
	
	public List<String> retorna() {
		return historial;
	}
	
	public void eliminaUltim() {
		if(historial.size()>0)
			historial.remove(historial.size()-1);
	}

}
