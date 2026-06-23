package estudos_java.io_e_nio;
import java.io.*;

public class Io {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("C:\\Users\\oncel\\OneDrive\\Documentos\\Academico_java\\Projetos_java.txt");
            writer.write("Olá, Rafaela");
            
            writer.close();

            FileReader reader = new FileReader("C:\\Users\\oncel\\OneDrive\\Documentos\\Academico_java\\Projetos_java.txt");

            int data = reader.read();

            while (data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
