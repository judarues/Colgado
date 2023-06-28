package colgado.colgado;

import AccesoDatos.FrasesDA;
import Modelo.FraseModelo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ArrayList listaFrases;
    public static ArrayList listaTopicos;
    public FraseModelo frase;

    @Override
    public void start(Stage stage) throws IOException {
        frase = new FraseModelo();
        frase.listFrases();
        // Crear una nueva escena cargando el archivo FXML de la vista del menú
        scene = new Scene(loadFXML("/Vista/menuVista"), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        // Establecer la raíz de la escena con el contenido cargado desde un archivo FXML
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        // Cargar y leer el archivo FXML utilizando el cargador de FXML
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        // Lanzar la aplicación JavaFX
        launch();
    }

    
}
