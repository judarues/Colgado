/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Desarrollador
 */
public class ConexionMySql {

    private Connection cnx;
    private String user = "admindbcolgado";
    private String password = "Colgado2023.";
    private String server = "db4free.net";
    private String port = "3306";
    private String dbName = "colgadodb";
    private String url = "jdbc:mysql://" + server + ":" + port + "/" + dbName + "?serverTimerzone=UTC";
    private String driver = "com.mysql.jdbc.Driver";

    public ConexionMySql() {
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, password);
            if (cnx != null) {
                System.out.println("cnx ok!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return cnx;
    }

}
