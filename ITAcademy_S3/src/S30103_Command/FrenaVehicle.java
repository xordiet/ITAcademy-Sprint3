package S30103_Command;

public class FrenaVehicle implements Ordre {

	private Vehicle vehicle;
	
	public FrenaVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executa() {
		vehicle.frenar();
	}

}
