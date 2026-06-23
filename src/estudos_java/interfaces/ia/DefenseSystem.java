package estudos_java.interfaces.ia;

public interface DefenseSystem {

    default void scan() {
      System.out.println("Scanning perimeter...");
   }
   static void protocol() {
      System.out.println("Starting Orion Industries Protocols...");
   }    
}
