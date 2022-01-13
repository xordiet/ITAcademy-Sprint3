package S30102_AbstractFactory;

public class PaisDE implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisDE() {
		this.prefix = "+49 ";
		this.sufix = " - GERMANY";
	}

	@Override
	public String formataAdresa(String registre) {
		return registre+sufix;
	}

	@Override
	public String formataTelefon(String registre) {
		return prefix+registre;		
	}

}
