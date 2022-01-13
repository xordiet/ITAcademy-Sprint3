package s30202_Callback;

public abstract class Main {
    
    public static void main(String[] args){
    	var task = new Pagament();
    	task.setFormaPagament("Paypal");
    	
        task.executeWith(() -> System.out.println("Gràcies per la teva compra!"));
    }

}
