package S30102_AbstractFactory;

import java.util.ArrayList;
import java.util.List;

import S30102_AbstractFactory.FabricaAbstracta.Paisos;

public class Main {

	public static void main(String[] args) {
		List<Registre> agenda = new ArrayList<Registre>();
		FabricaAbstracta factory = FabricaAbstracta.getFactory(Paisos.ALEMANYA);
		Adresa adrs = factory.formataAdresa("Main strasse 45");
		Telefon telf = factory.formataTelefon(678123456);
		agenda.add(adrs);
		agenda.add(telf);
		System.out.println(agenda);
		
	}

}
