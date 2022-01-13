package s30201_Observer;

public class Agencia1 extends Agencia{
	
	public Agencia1(AgentBorsa agent) {
		this.agent = agent;
		this.agent.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agencia 1: "+Integer.toString( agent.getEstat() ) );
	}

}
