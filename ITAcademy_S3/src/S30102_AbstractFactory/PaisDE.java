package S30102_AbstractFactory;

public class PaisDE implements Pais{
	
	private String prefix;
	private String sufix;
	
	public PaisDE() {
		this.prefix = "+49 ";
		this.sufix = " - GERMANY";
	}

	@Override
	public void formataAdresa() {
		// TODO Auto-generated method stub
		System.out.println(sufix);
	}

	@Override
	public void formataTelefon() {
		// TODO Auto-generated method stub
		System.out.println(prefix);		
	}

}
