package s30201_Observer;

public class Agencia3 extends Agencia{
	
	public Agencia3(AgentBorsa agent) {
		this.agent = agent;
		this.agent.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agencia 3: "+Integer.toString( agent.getEstat() ) );
	}

}
