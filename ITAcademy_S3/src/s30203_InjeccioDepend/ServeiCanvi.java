package s30203_InjeccioDepend;

public class ServeiCanvi {
	CanvUSD dolars;
	CanvGBP lliures;
	CanvHRK kunes;
	CanvCHF francSuis;
	
	public ServeiCanvi(CanvUSD dolars, CanvGBP lliures, CanvHRK kunes, CanvCHF chufes) {
		this.dolars = dolars;
		this.lliures = lliures;
		this.kunes = kunes;
		this.francSuis = chufes;
	}
	
	public void canviar() {
		dolars.canvia();
		lliures.canvia();
		kunes.canvia();
		francSuis.canvia();
	}

}
