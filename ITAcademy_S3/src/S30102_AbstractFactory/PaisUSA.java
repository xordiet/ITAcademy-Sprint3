package S30102_AbstractFactory;

public class PaisUSA implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisUSA() {
		this.prefix = "+33 ";
		this.sufix = " - FRANCE";
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
