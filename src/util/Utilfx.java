package util;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Utilfx {

    public static Stage abrirTela(String tela) throws IOException {
        URL url = Utilfx.class.getResource("/view/" + tela + ".fxml");
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = loader.load();
        
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        return stage;
    }

    public static void abrirTela(String tela, BorderPane bpane) throws IOException {
        URL url = Utilfx.class.getResource("/view/" + tela + ".fxml");
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = loader.load();        
        bpane.setCenter(root);
    }


    public static void mensagem(String msg) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }

    public static boolean pergunta(String msg) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        
        return (alert.showAndWait().get() == ButtonType.OK);
    }
    
}