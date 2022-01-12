package S30102_AbstractFactory;

public class FabricDE extends FabricaAbstracta{
	
	@Override
	public Adresa formataAdresa(String adresa) {
		Adresa addr = new Adresa();
		addr.setRegistre(adresa+" - Deutschland");
		return addr;
	}

	@Override
	public Telefon formataTelefon(Integer telefon) {
		Telefon telf = new Telefon();
		telf.setRegistre("+49 "+telefon);
		return telf;
	}

	
}
