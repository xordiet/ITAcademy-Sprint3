package s30202_Callback;

public class Main {

	public static void main(String[] args) {
		var task = new TascaSimple();
	    task.executeWith(() -> System.out.println("Fet! :)"));
	}

}
