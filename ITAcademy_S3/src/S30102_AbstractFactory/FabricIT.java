package S30102_AbstractFactory;

public class FabricIT extends FabricaAbstracta{

	@Override
	public Adresa formataAdresa(String adresa) {
		Adresa addr = new Adresa();
		addr.setRegistre(adresa+" - Italia");
		return addr;
	}

	@Override
	public Telefon formataTelefon(Integer telefon) {
		Telefon telf = new Telefon();
		telf.setRegistre("+39 "+telefon);
		return telf;
	}
	

}
