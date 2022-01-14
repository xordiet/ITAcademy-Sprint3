package s30203_InjeccioDepend;

public class CanvHRK {
	
	private double quantitat;
	
	public CanvHRK(double quantitat) {
		this.quantitat = quantitat;
	}
	
	public double getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(double quantitat) {
		this.quantitat = quantitat;
	}

	
	public void canvia() {
		double resultat = quantitat*TasaCanvi.KUNA;
		double arrodoneix = Math.round(resultat*100.0)/100.0;
		System.out.println("fent el canvi en Kunes: "+arrodoneix+"HRK");
	}

}
