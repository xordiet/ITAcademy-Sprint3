package S30102_AbstractFactory;

public class PaisUSA implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisUSA() {
		this.prefix = "+33 ";
		this.sufix = " - FRANCE";
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
