package s30201_Observer;

public class Agencia2 extends Agencia{
	
	public Agencia2(AgentBorsa agent) {
		this.agent = agent;
		this.agent.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agencia 2: "+Integer.toString( agent.getEstat() ) );
	}

}
