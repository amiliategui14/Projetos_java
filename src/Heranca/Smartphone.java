package heranca;
class LigarCelular {
    public void funcao() {
        System.out.println("Celular esta ligando...");
    }
}
class CelularLigado extends LigarCelular {
    @Override
    public void funcao() {
        super.funcao();
        System.out.println("Celular ligado. Desbloqueie o PIN para acessar.");
    }
}
class Pin extends LigarCelular {
    @Override
    public void funcao() {
        System.out.println("PIN incorreto tente novamente");
    }
}
class PinTentativas extends LigarCelular {
    @Override
    public void funcao() {
        System.out.println("PIN correto, acesso liberado! Atualizando sistema operacional");
    }
}
class Sistema extends LigarCelular {
    @Override
    public void funcao() {
        System.out.println("Bem vindo ao Android, sistema pronto para uso!");
    }
}
public class Smartphone {
    public static void main(String[] args) {
        
        CelularLigado on = new CelularLigado();
        on.funcao();
        Pin open = new Pin();
        open.funcao();
        PinTentativas openOnce = new PinTentativas();
        openOnce.funcao();
        Sistema sys = new Sistema();
        sys.funcao();
    }
}
