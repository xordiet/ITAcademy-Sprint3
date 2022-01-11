package S30101_Singleton;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// al ser private no puc crear una nova instància
		//Undo desfes = new Undo();
		
		menuGeneral();
	}
	
	private static void menuGeneral() {
		int opcio = pregunta();
		switch(opcio) {
			case 1:
				afegir();
				break;
			case 2:
				llistar();
				break;
			case 3:
				eliminar();
				break;
			case -1:
				System.out.println("Adeu, i gràcies!");
				break;
			}
	}
	
	private static int pregunta() {
		int retorn;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Si us plau, escolliu una opció:");
		System.out.println("1. Introduïr acció\t 2. Llistar historial\t 3.Esborrar darrera entrada");
		System.out.println("Per sortir premi 9");
		if (entrada.hasNextInt()) {
			int opcio = entrada.nextInt();
			if (opcio>0 && opcio<4) {
				System.out.println("Has triat "+opcio);
				retorn = opcio;
			} else if(opcio==9) {
				entrada.close();
				retorn = -1;
			} else {
				System.out.println("Ho sento, la opció ha de ser entre '1', '2' i '3', i no pas "+opcio);
				retorn = 0;
				menuGeneral();
			}
			
		} else {
			System.out.println("Ho sento, l'opció escollida no és vàlida.");
			retorn = 0;
			menuGeneral();
		}
		//entrada.close();
		return retorn;
	}
	
	private static void afegir() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Si us plau, introduïu una acció:");
		String accio = entrada.nextLine();
		Undo u = Undo.getInstance();
		u.afegir(accio);
		menuGeneral();
	}
	
	private static void llistar() {
		Undo u = Undo.getInstance();
		System.out.println(u.retorna());
		menuGeneral();
	}
	
	private static void eliminar() {
		Undo u = Undo.getInstance();
		u.eliminaUltim();
		menuGeneral();
	}

}
