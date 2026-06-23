package estudos_java.polimorfismo;

public class Jarvis {
    public static void main(String[] args) {
        
        Sistema info = new Sistema("4.0", "Rafaela Stark", "22/05/2026");
		System.out.println(MachineLearning.SITUACAO);
		
		info.ativarAtualizacao();
		info.versaoAntiga();
		info.novaVersao();

		System.out.println("Versão: " + info.getVersao());
		System.out.println("Autor: " + info.getAutor());
		System.out.println("Data do Lançamento: " + info.getData());


		info.comando();
		Atualizacao.desativado();

    }
}
