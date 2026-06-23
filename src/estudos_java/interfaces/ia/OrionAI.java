package estudos_java.interfaces.ia;

public class OrionAI extends OrionSystem {
   
    private Data data;
    public OrionAI(int id, Data data) {
        super(id);
        this.data = data;
    }
   
    @Override
    public void comando() {
        System.out.println("Protocol analysis, update, and security system completed.");
    }
    
    @Override
    public void answer() {
        System.out.println("At your service, Sir.");
    }

    public void showData() {
        System.out.println("IA: " + data.getName());
        System.out.println("Version: " + data.getVersion());
        System.out.println("Creator: " + data.getCreator());
    }
}
