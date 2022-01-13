package s30202_Callback;

public final class Pagament extends Tasca{
	
	private Main.Pagament formaPagament;
	private Double totalCompra;
	
	

	public Main.Pagament getFormaPagament() {
		return formaPagament;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setFormaPagament(Main.Pagament formaPagament) {
		this.formaPagament = formaPagament;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

	@Override
	public void executa() {
		System.out.println("Faig el pagament de " + getTotalCompra() + " amb " + getFormaPagament() + " i retorno el resultat via CallBack");
	}

}
