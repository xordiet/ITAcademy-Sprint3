package S30103_Command;

public class Main {

	public static void main(String[] args) {
		Vehicle cotxe = new Cotxe("Berlingo");
		Vehicle bicicleta = new Bicicleta("BH");
		Vehicle vaixell = new Vaixell("veler");
		Vehicle avio = new Avio("747");
		
		ArrencaVehicle arrencaCotxe  = new ArrencaVehicle(cotxe);
		AcceleraVehicle acceleracotxe = new AcceleraVehicle(cotxe);
		FrenaVehicle frenaCotxe = new FrenaVehicle(cotxe);

		ArrencaVehicle arrencaBicicleta  = new ArrencaVehicle(bicicleta);
		AcceleraVehicle acceleraBicicleta = new AcceleraVehicle(bicicleta);
		FrenaVehicle frenaBicicleta = new FrenaVehicle(bicicleta);

		ArrencaVehicle arrencaVaixell  = new ArrencaVehicle(vaixell);
		AcceleraVehicle acceleraVaixell = new AcceleraVehicle(vaixell);
		FrenaVehicle frenaVaixell = new FrenaVehicle(vaixell);

		ArrencaVehicle arrencaAvio  = new ArrencaVehicle(avio);
		AcceleraVehicle acceleraAvio = new AcceleraVehicle(avio);
		FrenaVehicle frenaAvio = new FrenaVehicle(avio);

		Pilot pilot = new Pilot();
		pilot.rebreOrdre(arrencaCotxe);
		pilot.rebreOrdre(acceleracotxe);
		pilot.rebreOrdre(frenaCotxe);
		pilot.rebreOrdre(arrencaBicicleta);
		pilot.rebreOrdre(acceleraBicicleta);
		pilot.rebreOrdre(frenaBicicleta);
		pilot.rebreOrdre(arrencaVaixell);
		pilot.rebreOrdre(acceleraVaixell);
		pilot.rebreOrdre(frenaVaixell);
		pilot.rebreOrdre(arrencaAvio);
		pilot.rebreOrdre(acceleraAvio);
		pilot.rebreOrdre(frenaAvio);
		
		pilot.executaOrdres();

	}

}
