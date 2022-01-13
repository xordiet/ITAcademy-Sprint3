package S30102_AbstractFactory;

public class FormataPais implements FabricaAbstracta{

	@Override
	public Pais getPais(String paisRebut) {
		Pais pais = null;
		switch(paisRebut){
			case "Alemanya":
				pais = new PaisDE();
				break;
			case "França":
				pais =  new PaisFR();
				break;
			case "Italia":
				pais = new PaisIT();
				break;
			case "USA":
				pais = new PaisUSA();
				break;
		}
		return pais;
	}

	@Override
	public Registre getRegistre(String registre) {
		// TODO Auto-generated method stub
		return null;
	}

}
