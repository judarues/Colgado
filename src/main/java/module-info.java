module colgado.colgado {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens Modelo to javafx.fxml;
    exports Modelo;
    
    opens AccesoDatos to javafx.fxml;
    exports AccesoDatos;
    
    opens Controlador to javafx.fxml;
    exports Controlador;
    
    opens colgado.colgado to javafx.fxml;
    exports colgado.colgado;
    
}
