package interfaces.stark_ia;

public class Main {
    public static void main(String[] args) {
        Control controle = new Control();

        System.out.println(IA.STATUS);
        controle.ativar();
        controle.analisar();
    }
}
