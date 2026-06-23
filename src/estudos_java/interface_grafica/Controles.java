package estudos_java.interface_grafica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controles extends Application {
    @Override
    public void start(Stage palco) {
        
        // criando Label(Rótulo)
        Label label = new Label("Olá pessoal! Sou uma etiqueta (Label)");

        // criando Button(Botão)
        Button botao = new Button("Clica aqui");

        // criando TextField(campo de texto)
        TextField campoTexto = new TextField();

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);

        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
