package estudos_java.programacao_funcional;
import java.util.function.*;
import java.util.Arrays;
import java.util.List;
public class Jarvis {
    public static void main(String[] args) {
        Ia on = (nome, comado) -> "Olá " + nome + ". Executando comando: " + comado;
        System.out.println(on.responder("Stark", "Abrindo o navegador"));

        Atualizacao version = versao -> "Versão atual: " + versao;
        System.out.println(version.atualizacao(2.0f));

        // Listas de IAs
        List<String> ia = Arrays.asList("JARVIS", "FRIDAY", "ORION");

        System.out.println("INTELIGÊNCIAS ARTIFICIAIS CRIADAS:");
        ia.forEach(System.out::println);
    }
}
