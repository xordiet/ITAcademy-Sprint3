package S30102_AbstractFactory;

public class Main {

	public static void main(String[] args) {
		PaisosFabrica fabrica = new PaisosFabrica();
		
		Pais pais1 = fabrica.getConexion("Alemanya");
		pais1.formataAdresa();
		pais1.formataTelefon();
		
		
		

	}

}
