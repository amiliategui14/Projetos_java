package heranca;
class Jarvis {
    String comando;
    public void ativar() {
        System.err.println("Jarvis: Sim senhorita Rafaela, no que posso ajudar?");
    }
}
class Usuario extends Jarvis {
    @Override
    public void ativar(){
        super.ativar();
        System.out.println("Ativar alarme de segurança.\nJarvis: Entendido. Sistema de alarme ativado!");
    }
}

public class IA {
    public static void main(String[] args) {
        Usuario user = new Usuario();

        user.comando = "Jarvis";
        System.out.println("Hey " + user.comando);
        user.ativar();
    }
}