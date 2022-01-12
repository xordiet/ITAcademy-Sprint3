package S30102_AbstractFactory;

public class FabricUS extends FabricaAbstracta{

	@Override
	public Adresa formataAdresa(String adresa) {
		Adresa addr = new Adresa();
		addr.setRegistre(adresa+" - USA");
		return addr;
	}

	@Override
	public Telefon formataTelefon(Integer telefon) {
		Telefon telf = new Telefon();
		telf.setRegistre("+1 "+telefon);
		return telf;
	}

	
	
}
