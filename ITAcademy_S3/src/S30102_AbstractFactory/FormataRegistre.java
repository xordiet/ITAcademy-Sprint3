package S30102_AbstractFactory;

public class FormataRegistre implements FabricaAbstracta{

	@Override
	public Pais getPais(String pais) {
		return null;
	}

	@Override
	public Registre getRegistre(String registreRebut) {
		Registre registre = null;
		switch(registreRebut) {
			case "telefon":
				registre = new RegistreTelefon();
				break;
			case "adresa":
				registre = new RegistreAdresa();
				break;
		}
		return registre;
	}


}
