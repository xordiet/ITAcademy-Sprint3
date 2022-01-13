package S30102_AbstractFactory;

public class RegistreAdresa implements Registre{
	private String adresa;

	@Override
	public void creaRegistre(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String retornaReigstre() {
		return adresa;
	}
	
	

}
