package s30202_Callback;

public abstract class Main {
    
    public static void main(String[] args){
        TascaA obj = new TascaA();
        EventListener mListener = new TascaB();
        obj.registerEventListener(mListener);
        obj.doAccio();
    }

}
