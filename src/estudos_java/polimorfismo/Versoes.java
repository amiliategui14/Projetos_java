package estudos_java.polimorfismo;

public abstract class Versoes implements Atualizacao{
    @Override
    public abstract void comando();
    
    public void ativarAtualizacao() {
        Atualizacao.super.ativo();
        System.out.println("Jarvis: Sistema ativado e pronto para atualização");
    }

    public void desativarAtualizacao() {
        Atualizacao.desativado();
    }
    
    @Deprecated(since = "2.0", forRemoval = true)
    protected void versaoAntiga() {
        System.out.println("Essa versão é antiga e em breve não sera possível uso");
    }

    public void novaVersao() {
        System.out.println("Nova versão pronta para ser instalada.");
    }
}
