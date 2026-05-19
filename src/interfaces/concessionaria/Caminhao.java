package interfaces.concessionaria;

class Caminhao extends Dados {
    Caminhao(int codigo, String modelo, String dono, String placa) {
        super(codigo, modelo, dono, placa);
    }

    @Override
    void acelerar() {
        System.out.println("O caminhao esta acelerando lentamente..");
    }
}
