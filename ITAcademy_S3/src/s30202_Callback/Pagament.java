package s30202_Callback;

public final class Pagament extends Tasca{
	
	private String formaPagament;

	public String getFormaPagament() {
		return formaPagament;
	}

	public void setFormaPagament(String formaPagament) {
		this.formaPagament = formaPagament;
	}

	@Override
	public void executa() {
		System.out.println("Faig el pagament amb " + getFormaPagament() + " i retorno el resultat via CallBack");
	}

}
