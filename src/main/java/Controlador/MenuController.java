package Controlador;

import colgado.colgado.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import AccesoDatos.ConexionMySql;
import Modelo.FraseModelo;

public class MenuController {

    @FXML
    private void testCnx() {

    }

    // Método para cambiar a la vista de reglas
    @FXML
    private void switchToReglas() throws IOException {
        App.setRoot("/Vista/reglasVista");
    }

    // Variables que representan los paneles y botones en la interfaz gráfica
    @FXML
    private Pane pane_jugadores;
    @FXML
    private Pane pane_tiempoLimite;
    @FXML
    private Pane pane_topicoFrase;
    @FXML
    private Pane pane_puntos;

    @FXML
    private Button btn_jugadores;
    @FXML
    private Button btn_tiempoLimite;
    @FXML
    private Button btn_topicoFrase;
    @FXML
    private Button btn_puntos;

    @FXML
    private ToggleGroup rdb_Jugadores;
    @FXML
    private RadioButton rdb_unJugador;
    @FXML
    private RadioButton rdb_dosJugadores;
    @FXML
    private RadioButton rdb_tresJugadores;

    @FXML
    private Pane nombre_unJugador;

    @FXML
    private Pane nombre_dosJugador;

    @FXML
    private Pane nombre_tresJugador;

    @FXML
    private ToggleGroup rdb_tiempo ;
    
    @FXML
    private RadioButton btn_15S;
    @FXML
    private RadioButton btn_30S;
    @FXML
    private RadioButton btn_45S;
    @FXML
    private RadioButton btn_60S;

    // Método para manejar el evento de clic en los botones
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Arreglo de los paneles
        Pane[] panes = {pane_jugadores, pane_tiempoLimite, pane_topicoFrase, pane_puntos};

        // Obtiene el botón que fue clicado
        Button clickedButton = (Button) event.getSource();

        // Realiza una acción basada en el botón clicado
        switch (clickedButton.getId()) {
            case "btn_jugadores":
                // Si se clicó el botón "btn_jugadores", muestra el panel de jugadores y oculta los demás
                pane_jugadores.setVisible(true);
                pane_tiempoLimite.setVisible(false);
                pane_topicoFrase.setVisible(false);
                pane_puntos.setVisible(false);
                break;
            case "btn_tiempoLimite":
                // Si se clicó el botón "btn_tiempoLimite", muestra el panel de tiempo límite y oculta los demás
                pane_jugadores.setVisible(false);
                pane_tiempoLimite.setVisible(true);
                pane_topicoFrase.setVisible(false);
                pane_puntos.setVisible(false);
                break;
            case "btn_topicoFrase":
                // Si se clicó el botón "btn_topicoFrase", muestra el panel de tópico de frase y oculta los demás
                pane_jugadores.setVisible(false);
                pane_tiempoLimite.setVisible(false);
                pane_topicoFrase.setVisible(true);
                pane_puntos.setVisible(false);
                break;
            case "btn_puntos":
                // Si se clicó el botón "btn_puntos", muestra el panel de puntos y oculta los demás
                pane_jugadores.setVisible(false);
                pane_tiempoLimite.setVisible(false);
                pane_topicoFrase.setVisible(false);
                pane_puntos.setVisible(true);
                break;
            default:
                break;
        }
    }

    //Oculta campos dependiendo de numero de jugadores
    @FXML
    public void initialize() {
        // Oculta campos dependiendo del número de jugadores
        rdb_unJugador.setOnAction(e -> {
            nombre_dosJugador.setVisible(false);
            nombre_tresJugador.setVisible(false);
        });

        rdb_dosJugadores.setOnAction(e -> {
            nombre_dosJugador.setVisible(true);
            nombre_tresJugador.setVisible(false);
        });

        rdb_tresJugadores.setOnAction(e -> {
            nombre_dosJugador.setVisible(true);
            nombre_tresJugador.setVisible(true);
        });

        // Selecciona el botón de tiempo límite según el valor seleccionado
        String selectedTime = "15S"; // Aquí puedes establecer el valor seleccionado según tus necesidades

        ToggleGroup toggleGroup = new ToggleGroup();
        btn_15S.setToggleGroup(toggleGroup);
        btn_30S.setToggleGroup(toggleGroup);
        btn_45S.setToggleGroup(toggleGroup);
        btn_60S.setToggleGroup(toggleGroup);

        switch (selectedTime) {
            case "15S":
                toggleGroup.selectToggle(btn_15S);
                break;
            case "30S":
                toggleGroup.selectToggle(btn_30S);
                break;
            case "45S":
                toggleGroup.selectToggle(btn_45S);
                break;
            case "60S":
                toggleGroup.selectToggle(btn_60S);
                break;
            default:
                // Valor por defecto si el selectedTime no coincide con ninguna opción
                break;
        }
    }

}
