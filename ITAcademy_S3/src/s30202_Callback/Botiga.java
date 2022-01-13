package s30202_Callback;

public class Botiga {
	
	private double sumaTiquet;
	private Main.Pagament formaPagament;
	
	public double getSumaTiquet() {
		return sumaTiquet;
	}
	public Main.Pagament getFormaPagament() {
		return formaPagament;
	}
	public void setSumaTiquet(double sumaTiquet) {
		this.sumaTiquet = sumaTiquet;
	}
	public void setFormaPagament(Main.Pagament formaPagament) {
		this.formaPagament = formaPagament;
	}

	public void compra() {
		var task = new Pagament();
		task.setTotalCompra(sumaTiquet);
		task.setFormaPagament(formaPagament);
	
		task.executeWith(() -> System.out.println("Gràcies per la teva compra!"));	
	}
}
