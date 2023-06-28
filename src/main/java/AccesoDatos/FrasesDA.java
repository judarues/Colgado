/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Modelo.TopicoModelo;
import Modelo.FraseModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollador
 */
public class FrasesDA {

    private ConexionMySql cnx;

    public ArrayList<FraseModelo> listFrases() {
        ArrayList<FraseModelo> listaFrases = new ArrayList();
        try {
            cnx = new ConexionMySql();
            String query = "SELECT fraseId,frase,pista,topicoId FROM colgadodb.frases;";
            Connection cnxs = cnx.getConnection();
            PreparedStatement command = cnxs.prepareStatement(query);
            ResultSet data = command.executeQuery();
            while (data.next()) {
                FraseModelo fraseObj = new FraseModelo();
                fraseObj.setFraseId(Integer.parseInt(data.getString("fraseId")));
                fraseObj.setFrase(data.getString("frase"));
                fraseObj.setPista(data.getString("pista"));
                fraseObj.setTopicoId(Integer.parseInt(data.getString("topicoId")));
                listaFrases.add(fraseObj);
            }
            command.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaFrases;
    }

    public ArrayList<TopicoModelo> listTopicos() {
        ArrayList<TopicoModelo> listaTopicos = new ArrayList();
        try {
            cnx = new ConexionMySql();
            String query = "SELECT topicoId,topico FROM colgadodb.topicos;";
            Connection cnxs = cnx.getConnection();
            PreparedStatement command = cnxs.prepareStatement(query);
            ResultSet data = command.executeQuery();
            while (data.next()) {
                TopicoModelo TopicoObj = new TopicoModelo();
                TopicoObj.setTopicoId(Integer.parseInt(data.getString("topicoId")));
                TopicoObj.setTopico(data.getString("topico"));
                listaTopicos.add(TopicoObj);
            }
            command.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaTopicos;

    }

}
