package s30201_Observer;

public class Main {

	public static void main(String[] args) {
		//creem l'agent
		AgentBorsa agent = new AgentBorsa();
		
		//creem les agències
		new Agencia1(agent);
		new Agencia2(agent);
		new Agencia3(agent);
		new Agencia4(agent);
		new Agencia5(agent);
		
		System.out.println("Primer canvi de valor del producte: 15");
		agent.setEstat(15);		
		System.out.println("Segon canvi de valor del producte: 12");
		agent.setEstat(15);		
		System.out.println("Tercer canvi de valor del producte: 17");
		agent.setEstat(15);		

	}

}
