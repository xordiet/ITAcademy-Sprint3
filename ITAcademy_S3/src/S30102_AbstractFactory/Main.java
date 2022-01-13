package S30102_AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> agenda = new ArrayList<>();
		
		//genero una fàbrica de registres
		FabricaAbstracta fabricareg1 = FabricaGenerator.getFactory("Registre");
		//genero una fàbrica d'adreça
		Registre reg1 = fabricareg1.getRegistre("adresa");
		//estableixo l'adreça
		reg1.creaRegistre("Main strasse 45 (01234 Berlin)");
		//genero una fàbrica de telèfon
		Registre reg2 = fabricareg1.getRegistre("telefon");
		//estableixo el telèfon
		reg2.creaRegistre("678123456");
		//genero una fàbrica de paísos
		FabricaAbstracta fabricapais1 = FabricaGenerator.getFactory("Pais");
		//genero una fàbrica alemanya
		Pais pais1 = fabricapais1.getPais("Alemanya");
		//formato l'adreça i el telèfon i els afegeixo a l'agenda
		agenda.add(pais1.formataAdresa(reg1.retornaReigstre()));
		agenda.add(pais1.formataTelefon(reg2.retornaReigstre()));
		
		//llisto l'agenda
		System.out.println(agenda);
		
		

		
		
		
		
		
		

	}

}
