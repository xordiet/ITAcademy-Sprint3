package S30102_AbstractFactory;

public class PaisosFabrica {
	
	public Pais getConexion(String paisRebut) {
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

}
