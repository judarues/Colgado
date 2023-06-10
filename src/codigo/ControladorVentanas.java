package codigo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControladorVentanas extends Application {
    
    private Stage stagePrincipal;
    
    public ControladorVentanas() {
        // Constructor vacío
    }
    
    @Override
    public void start(Stage primaryStage) {
        stagePrincipal = primaryStage;
    }
    
    public void cargarEscenario() {
        // Implementa la lógica para cargar el escenario
    }
    
    public void cargarMenu() {
        try { 
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/vista/Escenario.fxml"));
            BorderPane botonSiguiente = (BorderPane) loader.load();
            Scene scene = new Scene(botonSiguiente);
            stagePrincipal.setScene(scene);
            stagePrincipal.show();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void cargarPlay() {
        // Implementa la lógica para cargar la vista "Play"
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
