package S30103_Command;

public class ArrencaVehicle implements Ordre {
	
	private Vehicle vehicle;
	
	public ArrencaVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executa() {
		vehicle.arrencar();
	}

}
