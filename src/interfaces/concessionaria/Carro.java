package interfaces.concessionaria;

abstract class Carro implements Automovel {
    int codigo = 10;

    Carro(int cod) {
        codigo = cod;
    }

    abstract void acelerar();
    @Override
    public void ativo() {
        System.out.println("Carro esta em movimento, alarme ativado");
    }

    void frear() {
        System.out.println("O carro esta freando..");
    }
}
