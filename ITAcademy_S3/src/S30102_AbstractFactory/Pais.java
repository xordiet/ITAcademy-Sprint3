package S30102_AbstractFactory;

public abstract class Pais {
	private String prefix;
	private String sufix;
	
	public Pais() {
	}
	
	public String getPrefix() {
		return prefix;
	}
	public String getSufix() {
		return sufix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSufix(String sufix) {
		this.sufix = sufix;
	}

}
