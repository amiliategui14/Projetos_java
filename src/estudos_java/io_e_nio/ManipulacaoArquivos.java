package estudos_java.io_e_nio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulacaoArquivos {
    public static void main(String[] args) {
        String nomeArquivo = "meuArquivo.txt";
        String conteudo = "Olá, Rafaela! Este é uma escrita";

        //escrevendo no arquivo
        escreverNoArquivo (nomeArquivo, conteudo);

        //lendo arquivo
        String conteudoLido = LerDoArquivo (nomeArquivo);
        System.out.println("Conteúdo lido do arquivo: " + conteudoLido);
    }
    public static void escreverNoArquivo (String nomeArqivo, String conteudo) {
        try {
            Path path = Paths.get(nomeArqivo);
            Files.write(path, conteudo.getBytes());
            System.out.println("Arquivo criado e texto escrito com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static String LerDoArquivo (String nomeArqivo) {
        try {
            Path path = Paths.get(nomeArqivo);
            byte[] bytes = Files.readAllBytes(path);
            return new String (bytes);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return "";
        }
    }
}
