package estudos_java.polimorfismo;

public interface Atualizacao extends MachineLearning, InteligenciaArtificial {
    public default void ativo() {
        System.out.println("Jarvis Online pronto para uso.");
    }
    static void desativado() {
        System.out.println("Jarvis Offline.");
    }
}
