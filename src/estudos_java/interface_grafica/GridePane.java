package estudos_java.interface_grafica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class GridePane extends Application {

    @Override
    public void start(Stage palco) {

        //criação dos elementos (rótulos, campos de texto e botoes)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("Email");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        // criação do GridPane
        GridPane gridPane = new GridPane();

        gridPane.setHgap(8); // espaçamento horizontal entre célualas
        gridPane.setVgap(8); // espaçamento vertical entre células
        gridPane.setPadding(new Insets(5)); //espaçamento externo

        // adição dos elementos ao Gridpane
        gridPane.addRow(0, rotuloNome, campoEmail);
        gridPane.addRow(1, rotuloEmail, campoNome);
        gridPane.addRow(2, botaoEnviar);

        // criação da cena e exibição do palco
        Scene cena = new Scene(gridPane, 400, 200);
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
