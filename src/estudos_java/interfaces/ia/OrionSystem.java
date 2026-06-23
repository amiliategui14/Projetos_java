package estudos_java.interfaces.ia;
;
// Abstract class
public abstract class OrionSystem implements VirtualAssistant {
    
    protected int id;

    public OrionSystem (int id) {
        this.id = id;
    }

    public abstract void comando(); 
    @Override
    public void activate() {
        System.out.println("ORION system activated.");
    }
}
