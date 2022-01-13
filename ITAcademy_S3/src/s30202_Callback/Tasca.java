package s30202_Callback;

import java.util.Optional;

public abstract class Tasca {
	final void executeWith(EventListener callback) {
		executa();
		Optional.ofNullable(callback).ifPresent(EventListener::crida);
	}
	
	public abstract void executa();
}
