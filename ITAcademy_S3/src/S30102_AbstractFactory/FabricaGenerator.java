package S30102_AbstractFactory;

public class FabricaGenerator {
	
	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("Pais")) {
			return new FormataPais();

		} else if (tipoFabrica.equalsIgnoreCase("Registre")) {
			return new FormataRegistre();
		}

		return null;
	}

}
