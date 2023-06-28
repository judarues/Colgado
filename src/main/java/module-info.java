module colgado.colgado {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens Controlador to javafx.fxml;
    exports Controlador;
    
    opens colgado.colgado to javafx.fxml;
    exports colgado.colgado;
    
}
