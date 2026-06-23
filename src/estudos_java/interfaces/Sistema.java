package estudos_java.interfaces;
interface Atualizacao {
	public void update();
}
class VersaoAntiga implements Atualizacao {
	@Override
	public void update() {
		System.out.println("Baixar nova atualização.\nBaixando atualização..");
	}
}
class VersaoNova implements Atualizacao {
	@Override
	public void update() {
		System.out.println("Atualizando sistema..aguarde a reinicialização\nReiniciando sistema..." + " Sistema reiniciado e atualizado com sucesso!");
	}
}
public class Sistema {
	public static void main(String[] args) {
		VersaoAntiga antiga = new VersaoAntiga();
		antiga.update();

		VersaoNova nova = new VersaoNova();
		nova.update();
	}
}