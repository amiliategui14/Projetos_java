package estudos_java.interfaces.stark_ia;

interface IA {
    public static final String STATUS = "J.A.R.V.I.S. CORE";
    void ativar();

}

interface Jarvis extends IA {
    void analisar();
}
