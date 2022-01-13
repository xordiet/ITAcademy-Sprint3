package S30102_AbstractFactory;

public class RegistreTelefon implements Registre {
	
	private String telefon;

	@Override
	public void creaRegistre(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String retornaReigstre() {
		return telefon;
	}

}
