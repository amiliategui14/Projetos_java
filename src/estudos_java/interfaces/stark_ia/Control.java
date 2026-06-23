package estudos_java.interfaces.stark_ia;

class Control implements Jarvis {
    @Override
    public void ativar() {
        System.out.println("JARVIS ativado");
    }
    @Override
    public void analisar() {
        System.out.println("JARVIS: Analisando protocolos...");
    }
}
