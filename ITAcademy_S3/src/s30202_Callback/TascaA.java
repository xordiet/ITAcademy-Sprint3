package s30202_Callback;

public class TascaA {
	private EventListener mListener;
	
	// setting the listener
    public void registerEventListener(EventListener mListener){
        this.mListener = mListener;
    }
	
    // la tasca síncrona
    public void doAccio(){
    	//fem alguna operació
    	System.out.println("Fem una operació abans de la crida a la tasca");
    	
    	//mirem si el listener ja s'ha cridat
    	if (this.mListener != null) {
    		mListener.crida();
    	}
    	
    }
}
