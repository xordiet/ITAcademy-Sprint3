package S30102_AbstractFactory;

public class FormataRegistre implements FabricaAbstracta{

	@Override
	public Pais getPais(String pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Registre getRegistre(String registreRebut) {
		// TODO Auto-generated method stub
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
