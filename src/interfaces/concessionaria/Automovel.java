package interfaces.concessionaria;

interface Automovel extends Concessionaria, Alarme {
    @Override
    void ativo();
}
