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

    Stage stage;
    @FXML
    private Label lb_Titulo;
    @FXML
    private Label lb_NumMesas;
    @FXML
    private Button btn_EXIT;
    @FXML
    private AnchorPane Menu;
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
    @FXML
    private Button btn_addSnack;
    @FXML
    private Button btn_ListarProdutos;
    @FXML
    private Button btn_AtualizarPedido;
    @FXML
    private Button btn_FecharPedido;
    @FXML
    private Button btn_ConsultarHistorico;
    @FXML
    private Button btn_Exportar;
    @FXML
    private AnchorPane panel_ListarProdutos;
    @FXML
    private AnchorPane panel_FecharPedido;
    @FXML
    private ComboBox<?> cbx_NumMESAADDPedido1;
    private AnchorPane panel_AtualizarPedido;
    @FXML
    private ComboBox<?> cbx_NumMESAADDPedido;
    @FXML
    private ComboBox<?> cbx_;
    @FXML
    private Button btn_ADDItemPedido;
    @FXML
    private AnchorPane panel_ConsultarHistorico;
    @FXML
    private Button btn_FecharPedido1;
    @FXML
    private Button btn_dd;
    @FXML
    private AnchorPane panel_AdicionarPedido;

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
        panel_ListarProdutos.setVisible(false);
        panel_FecharPedido.setVisible(false);
        panel_AdicionarPedido.setVisible(false);
        panel_ConsultarHistorico.setVisible(false);
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
////////////////////////////////////////////////////////////
    //Cirar Produto
    @FXML
    private void show_PaneCriarProduto(ActionEvent event) {
        Pane_CriarProduto.setVisible(true);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Snack.setVisible(false);
        panel_Prato.setVisible(false);
    }
    //"add_..." serve para mostrar o formaulario de inserção
    @FXML
    private void add_Bebida(ActionEvent event) {
        panel_Bebida.setVisible(true);
        panel_Doce.setVisible(false);
        panel_Snack.setVisible(false);
        panel_Prato.setVisible(false);
    }

    @FXML
    private void add_Prato(ActionEvent event) {
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Snack.setVisible(false);
        panel_Prato.setVisible(true);
    }

    @FXML
    private void add_Snack(ActionEvent event) {
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Snack.setVisible(true);
        panel_Prato.setVisible(false);
    }

    @FXML
    private void add_Doce(ActionEvent event) {
        panel_Doce.setVisible(true);
        panel_Bebida.setVisible(false);
        panel_Snack.setVisible(false);
        panel_Prato.setVisible(false);
    }
    //////////////////////////////////////
    //adicionar Productdo 
    @FXML
    private void add_ComAlcool(ActionEvent event) {
    
        //se carregar neste insere com alcool
    }

    @FXML
    private void add_SemmAlcool(ActionEvent event) {
       
        //se carregar neste insere sem alcool
    }

    @FXML
    private void add_Caseiro(ActionEvent event) {
        
        //se carregar neste insere doce caseiro 
    }

    @FXML
    private void add_Fabrica(ActionEvent event) {
       
         //se carregar neste insere doce fabrica 
    }
    
    @FXML
    private void snack(ActionEvent event) {
        //adicionar Snack
    }
//////////////////////////////////////////////////////////
    //Listar Produtos
    @FXML
    private void show_panel_ListarProdutos(ActionEvent event) {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
        panel_ListarProdutos.setVisible(true);
        panel_FecharPedido.setVisible(false);
        panel_AdicionarPedido.setVisible(false);
        panel_ConsultarHistorico.setVisible(false);
    }
    
    
//////////////////////////////////////////////////////////
    //Adicionar Coisas ao pedido
    private void panel_AdicionarPedido(ActionEvent event) { /// ver botao sHOW add items
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
        panel_ListarProdutos.setVisible(false);
        panel_FecharPedido.setVisible(false);
        panel_AdicionarPedido.setVisible(true);
        panel_ConsultarHistorico.setVisible(false);
    }
    @FXML
    private void ADDItemPedido(ActionEvent event) {
    }
    
    
//////////////////////////////////////////////////////////
    //Fechar Pedido/apresentar
    @FXML
    private void show_panel_FecharPedido(ActionEvent event) {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
        panel_ListarProdutos.setVisible(false);
        panel_FecharPedido.setVisible(true);
        panel_AdicionarPedido.setVisible(false);
        panel_ConsultarHistorico.setVisible(false);
    }
    
    @FXML
    private void FecharPedido(ActionEvent event) {
    }
    
//////////////////////////////////////////////////////////
    //Consultar historico
    @FXML
    private void show_panel_ConsultarHistorico(ActionEvent event) {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
        panel_ListarProdutos.setVisible(false);
        panel_FecharPedido.setVisible(false);
        panel_AdicionarPedido.setVisible(false);
        panel_ConsultarHistorico.setVisible(true);
    }
    
    
    
//////////////////////////////////////////////////////////
    //Exportar Histórico
    @FXML
    private void show_panel_Exportar(ActionEvent event) {///é só exportar e manda se o alert para dizer que ta feito
        
    }

    @FXML
    private void show_panel_AtualizarPedido(ActionEvent event) {
        Pane_CriarProduto.setVisible(false);
        panel_Bebida.setVisible(false);
        panel_Doce.setVisible(false);
        panel_Prato.setVisible(false);
        panel_Snack.setVisible(false);
        panel_ListarProdutos.setVisible(false);
        panel_FecharPedido.setVisible(false);
        panel_AdicionarPedido.setVisible(true);
        panel_ConsultarHistorico.setVisible(false);
    }
    
    
    
    
    
    
   

    

    

    

    

    

    
    
    
    
    
    
    
    
    
    
    
}
    
