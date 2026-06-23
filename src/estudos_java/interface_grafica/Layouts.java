package estudos_java.interface_grafica;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Classe principal da aplicação JavaFX
public class Layouts extends Application {
    @Override
    public void start(Stage palco) {

        // Criação dos botões
        Button botao1 = new Button("Botao 1");
        Button botao2 = new Button("Botao 2");
        Button botao3 = new Button("Botao 3");
        Button botao4 = new Button("Botao 4");

        // HBox organiza os componentes na horizontal (lado a lado)
        HBox hBox = new HBox(botao1, botao2);
        // Alinha os componentes à direita
        hBox.setAlignment(Pos.CENTER_RIGHT);

        // Alinha os componentes à direita
        VBox vBox = new VBox(botao3, botao4);
        vBox.setAlignment(Pos.CENTER_RIGHT);

        // BorderPane divide a janela em cinco regiões:
        // Top (Topo)
        // Bottom (Inferior)
        // Left (Esquerda)
        // Right (Direita)
        // Center (Centro)
        BorderPane borderPane = new BorderPane();

        // Coloca o HBox na região superior da janela
        borderPane.setTop(hBox);

        // Coloca o VBox na região central da janela
        borderPane.setBottom(vBox);

        // Cria a cena com largura de 300 e altura de 300 pixels
        Scene cena = new Scene(borderPane, 300, 300);

        // Define a cena da janela
        palco.setScene(cena);
        
        // Define o título da janela
        palco.setTitle("Exemplo de layouts");

        // Exibe a janela
        palco.show();
    }
    // Método principal da aplicação
    public static void main(String[] args) {
        launch(args);
    }
}
