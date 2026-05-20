package interfaces.ia;

public class Orion {
    public static void main(String[] args) {
        Data data = new Data("Orion", "TW-90", "Tony Stark");
        
        OrionAI ia = new OrionAI(1034, data);

        System.out.println(Artificialintelligence.ON);
        ia.activate();
        ia.answer();
        ia.scan();
        DefenseSystem.protocol();
        ia.comando();

        ia.showData();

    }
}
