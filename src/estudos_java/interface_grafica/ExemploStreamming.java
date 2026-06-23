package estudos_java.interface_grafica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploStreamming extends Application {
    @Override
    public void start(Stage palco) {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "https://youtu.be/qM9745_dUWk?t=561";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo do video de Streamming");
        palco.setScene(cena);

        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
