package S30102_AbstractFactory;

public class PaisFR implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisFR() {
		this.prefix = "+49 ";
		this.sufix = " - GERMANY";
	}

	@Override
	public void formataAdresa() {
		// TODO Auto-generated method stub
	}

	@Override
	public void formataTelefon() {
		// TODO Auto-generated method stub
		
	}

}
