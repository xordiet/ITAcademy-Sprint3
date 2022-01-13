package S30103_Command;

public class AcceleraVehicle implements Ordre {

	private Vehicle vehicle;
	
	public AcceleraVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executa() {
		vehicle.accelerar();
	}

}
