package S30102_AbstractFactory;

public abstract class Registre {
	private String registre;

	public String getRegistre() {
		return registre;
	}

	public void setRegistre(String registre) {
		this.registre = registre;
	}

	@Override
	public String toString() {
		return "registre=" + registre ;
	}
	
	
	
}
