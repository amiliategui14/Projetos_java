package interfaces.concessionaria;

public class AbstactTest {
    public static void main(String[] args) {
        
        Caminhao caminhao = new Caminhao(1000, "Mercedes", "Manoel da Silva", "1JK78");

        System.out.println("Código: " + caminhao.codigo);
        System.out.println(Alarme.STATUS + " (Código ativado)");
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Dono: " +  caminhao.getDono());
        System.out.println("Placa: " + caminhao.getPlaca());

        caminhao.acelerar();
        caminhao.ativo();
        caminhao.frear();
    }
}
