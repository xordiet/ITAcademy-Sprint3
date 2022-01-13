package s30202_Callback;

import java.util.Optional;

public abstract class Tasca {
	boolean resultat;
	
	final boolean executeWith(EventListener callback) {
		resultat = paga();
		Optional.ofNullable(callback).ifPresent(EventListener::crida);
		return resultat;
	}
	
	public boolean retornaResultat() {
		return resultat;
	}
	
	public abstract boolean paga();
}
