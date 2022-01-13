package s30202_Callback;

public abstract class Main {
	
	enum Pagament {TARG_CREDIT, PAYPAL, CC};
    
    public static void main(String[] args){
    	
    	Botiga sabateria = new Botiga();
    	sabateria.setSumaTiquet(39.99);
    	sabateria.setFormaPagament(Pagament.PAYPAL);
    	sabateria.compra();
    }

}
