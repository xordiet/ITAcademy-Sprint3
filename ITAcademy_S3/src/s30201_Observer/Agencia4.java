package s30201_Observer;

public class Agencia4 extends Agencia{
	
	public Agencia4(AgentBorsa agent) {
		this.agent = agent;
		this.agent.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agencia 4: "+Integer.toString( agent.getEstat() ) );
	}

}
