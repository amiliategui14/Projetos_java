package interfaces.concessionaria;

public class Dados extends Carro {
    private String modelo;
    private String dono;
    private String placa;

    Dados(int codigo, String modelo, String dono, String placa) {
        
        super(codigo);

        this.modelo = modelo;
        this.dono = dono;
        this.placa = placa;
    }
    // Get
    public String getModelo() {
        return modelo;
    }
    public String getDono() {
        return dono;
    }
    public String getPlaca() {
        return placa;
    }

    //Set
    public void setModelo() {
        this.modelo = modelo;
    }
    public void setDono() {
        this.dono = dono;
    }
    public void setPlaca() {
        this.placa = placa;
    }

    @Override
    void acelerar() {
        System.out.println("O veículo esta acelerando...");
    }
}
