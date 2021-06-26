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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    @FXML
    private Button btn_CriarProduto;
    @FXML
    private AnchorPane Pane_CriarProduto;    
    @FXML
    private Button btn_Bebida;
    @FXML
    private Button btn_Prato;
    @FXML
    private Button btn_Snack;
    @FXML
    private Button btn_Doce;
    @FXML
    private AnchorPane panel_Bebida;
    @FXML
    private ComboBox<?> cbx_Iva;
    @FXML
    private TextField txt_NomeProduto;
    @FXML
    private ComboBox<?> cbx_Tamanho;
    @FXML
    private TextField txt_Preco;
    @FXML
    private Button btn_CAlcool;
    @FXML
    private Button btn_Salcool;
    @FXML
    private AnchorPane panel_Doce;
    @FXML
    private ComboBox<?> cbx_Iva1;
    @FXML
    private TextField txt_NomeProduto1;
    @FXML
    private TextField txt_Preco1;
    @FXML
    private Button btn_Caseiro;
    @FXML
    private Button btn_Fabrica;
    @FXML
    private AnchorPane panel_Prato;
    @FXML
    private ComboBox<?> cbx_Iva11;
    @FXML
    private TextField txt_NomeProduto11;
    @FXML
    private TextField txt_Preco11;
    @FXML
    private Button btn_prato;
    @FXML
    private ComboBox<?> cbx_Iva111;
    @FXML
    private TextField txt_NomeProduto111;
    @FXML
    private TextField txt_Preco111;
    @FXML
    private ComboBox<?> cbx_TamanhoSnack;
    @FXML
    private AnchorPane panel_Snack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
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

    @FXML
    private void show_PaneCriarProduto(ActionEvent event) {
        Showoff();
        Pane_CriarProduto.setVisible(true);
        
    }

    @FXML
    private void add_Bebida(ActionEvent event) {
        Showoff();
        panel_Bebida.setVisible(true);
    }

    @FXML
    private void add_Prato(ActionEvent event) {
        Showoff();
       panel_Prato.setVisible(true);
    }

    @FXML
    private void add_Snack(ActionEvent event) {
        Showoff();
        panel_Snack.setVisible(true);
    }

    @FXML
    private void add_Doce(ActionEvent event) {
        Showoff();
        panel_Doce.setVisible(true);
    }

    @FXML
    private void add_ComAlcool(ActionEvent event) {
        Showoff();
        
    }

    @FXML
    private void add_SemmAlcool(ActionEvent event) {
        Showoff();
    }

    @FXML
    private void add_Caseiro(ActionEvent event) {
        Showoff();
    }

    @FXML
    private void add_Fabrica(ActionEvent event) {
        Showoff();
    }
    
    
    
    
    
    
    public void Showoff() {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Snack.setVisible(false);
        panel_Prato.setVisible(false);
    }
    
}
    
