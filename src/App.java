import javafx.application.Application;
import javafx.stage.Stage;
import util.Utilfx;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Utilfx.abrirTela("TelaLogin");
    }
}
