/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScenceController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane HomePanel;
    @FXML
    private Label lb_Titulo;
    @FXML
    private Button btn_InserirMesa;
    @FXML
    private TextField txt_NumMesas;
    @FXML
    private Label lb_homePage;

    @FXML
    private void switchTo_Menu(javafx.event.ActionEvent event) throws IOException {
        //passar o numero de mesas
        String numMesas = txt_NumMesas.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        root = loader.load();
        MenuController menucontroller = loader.getController();
        menucontroller.diplayNumero(numMesas);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
