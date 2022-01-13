package S30103_Command;

public class Vehicle {
	
	private String nom;
	
	public Vehicle(String nom) {
		this.nom = nom;
	}
	
	public void arrencar() {
		System.out.println("El vehicle "+nom+" ha arrencat");
	}
	
	public void accelerar() {
		System.out.println("El vehicle "+nom+" ha accelerat");
	}
	
	public void frenar() {
		System.out.println("El vehicle "+nom+" ha frenat");
	}

}
