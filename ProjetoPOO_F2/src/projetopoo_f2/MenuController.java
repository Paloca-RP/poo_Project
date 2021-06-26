/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ricar
 */
public class MenuController implements Initializable {

    @FXML
    private Label lb_Titulo;
    @FXML
    private Label lb_NumMesas;
    @FXML
    private Button btn_EXIT;
    @FXML
    private AnchorPane Menu;
    
    Stage stage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void diplayNumero(String numMesas) {
        lb_NumMesas.setText("Numero de Mesas: " + numMesas);
    }    
    
    @FXML
    private void close(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("SAIR");
        alert.setHeaderText("Tem a certeza!");
		
	if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) Menu.getScene().getWindow();
            System.out.println("Saída com sucesso!");
            stage.close();
        }   
    }
}
    
