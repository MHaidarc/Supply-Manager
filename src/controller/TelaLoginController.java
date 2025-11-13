package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import util.Utilfx;

public class TelaLoginController {

    @FXML
    private TextField senha;

    @FXML
    private TextField user;

    @FXML
    void btncad(ActionEvent event) throws IOException {
        Utilfx.abrirTela("TelaPrincipal");

    }

}
