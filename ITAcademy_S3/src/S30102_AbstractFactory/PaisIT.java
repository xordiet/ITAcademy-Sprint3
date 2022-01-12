package S30102_AbstractFactory;

public class PaisIT implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisIT() {
		this.prefix = "+39 ";
		this.sufix = " - ITALIA";
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
