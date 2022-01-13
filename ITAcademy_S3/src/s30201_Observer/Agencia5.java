package s30201_Observer;

public class Agencia5 extends Agencia{
	
	public Agencia5(AgentBorsa agent) {
		this.agent = agent;
		this.agent.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agencia 5: "+Integer.toString( agent.getEstat() ) );
	}

}
