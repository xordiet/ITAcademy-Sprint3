package S30102_AbstractFactory;

public class PaisIT implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisIT() {
		this.prefix = "+39 ";
		this.sufix = " - ITALIA";
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
