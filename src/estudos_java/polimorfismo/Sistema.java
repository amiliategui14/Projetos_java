package estudos_java.polimorfismo;

public class Sistema extends Versoes{
    private String versao;
    private String autor;
    private String data;

    public Sistema(String versao, String autor, String data) {
        this.versao = versao;
        this.autor = autor;
        this.data = data;
    }

    public String getVersao() {
		return versao;
	}
	public String getAutor() {
		return autor;
	}
	public String getData() {
		return data;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setData(String data) {
		this.data = data;
	}

    public void comando() {
        System.out.println("Jarvis:  Sistema atualizado e otimizado com sucesso!");
    }
}
