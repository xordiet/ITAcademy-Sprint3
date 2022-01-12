package S30102_AbstractFactory;

public class FabricFR extends FabricaAbstracta{

	@Override
	public Adresa formataAdresa(String adresa) {
		Adresa addr = new Adresa();
		addr.setRegistre(adresa+" - France");
		return addr;
	}

	@Override
	public Telefon formataTelefon(Integer telefon) {
		Telefon telf = new Telefon();
		telf.setRegistre("+33 "+telefon);
		return telf;
	}
	
}
