/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import colgado.colgado.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Desarrollador
 */
public class ReglasController  {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("/Vista/menuVista");        
    }

  
    
}
