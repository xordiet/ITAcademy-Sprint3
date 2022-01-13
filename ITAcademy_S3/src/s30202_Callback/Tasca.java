package s30202_Callback;

import java.util.Optional;

public abstract class Tasca {
	
	final void executeWith(Callback callback) {
	    execute();
	    Optional.ofNullable(callback).ifPresent(Callback::call);
	}
	
	public abstract void execute();

}
