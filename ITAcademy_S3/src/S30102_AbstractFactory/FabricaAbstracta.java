package S30102_AbstractFactory;

abstract class FabricaAbstracta {
	public enum Paisos { USA, FRANÇA, ITALIA, ALEMANYA }
	
	private static final FabricUS USA_FABRIC = new FabricUS();
    private static final FabricFR FRA_FABRIC = new FabricFR();
	private static final FabricIT ITA_FABRIC = new FabricIT();
    private static final FabricDE DEU_FABRIC = new FabricDE();
    

    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    static FabricaAbstracta getFactory(Paisos pais) {
    	FabricaAbstracta factory = null;
        switch (pais) {
	        case USA:
	        	factory = USA_FABRIC;
	        	break;
            case FRANÇA:
                factory = FRA_FABRIC;
                break;
            case ITALIA:
                factory = ITA_FABRIC;
                break;
            case ALEMANYA:
            	factory = DEU_FABRIC;
            	break;
        }
        return factory;
    }

    public abstract Adresa formataAdresa(String adresa);

    public abstract Telefon formataTelefon(Integer telefon);
    

}
