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
	
		task.executeWith(() -> {
			if(task.retornaResultat()) {
				System.out.println(task.retornaResultat()+" Gràcies per la teva compra!");
			} else {
				System.out.println(task.retornaResultat()+" Hi ha hagut un error en el procès de pagament.");
				System.out.println("Si us plau, torna a intentar el pagament.");
			}
		});
	}
}
