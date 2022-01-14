package s30203_InjeccioDepend;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Article> articles = new ArrayList<Article>();
		
		Article sabates = new Article("Sabates", 49.99);
		articles.add(sabates);
		Article rpi = new Article("Raspberry pi", 51.85);
		articles.add(rpi);
		Article ender3 = new Article("Creality Ender 3 V2", 296.00);
		articles.add(ender3);
		Article camera = new Article("TP-Link TAPO C210", 39.90);
		articles.add(camera);
		
		articles.forEach(a->{
			System.out.println("Calculant el canvi de "+a.toString());
			CanvUSD canviUSD = new CanvUSD(a.getPreu());
			CanvGBP canviGBP = new CanvGBP(a.getPreu());
			CanvHRK canviHRK = new CanvHRK(a.getPreu());
			CanvCHF canviCHF = new CanvCHF(a.getPreu());
			ServeiCanvi servei = new ServeiCanvi(canviUSD, canviGBP, canviHRK, canviCHF);
			servei.canviar();
		});
		
		
		
		

	}

}
