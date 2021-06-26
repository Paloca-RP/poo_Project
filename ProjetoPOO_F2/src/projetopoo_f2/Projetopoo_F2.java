/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author Ricar
 */
public class Projetopoo_F2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try{ 
            Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
            Scene scene = new Scene(root);        
            stage.setScene(scene);
            stage.show();        
            
            stage.setOnCloseRequest(event -> {
               event.consume();
               close(stage);
            });
        }catch(Exception e){
            e.printStackTrace();
        }       
    }
    public void close(Stage stage){	
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Tem a certeza que quer sair?");
		
		if (alert.showAndWait().get() == ButtonType.OK){
			System.out.println("Saida com Sucesso");
			stage.close();
		} 
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
