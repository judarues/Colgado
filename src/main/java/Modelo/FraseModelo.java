/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import AccesoDatos.FrasesDA;
import static colgado.colgado.App.listaFrases;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Desarrollador
 */
public class FraseModelo {

    int fraseId;
    String frase;
    String pista;
    int topicoId;

    public int getFraseId() {
        return fraseId;
    }

    public void setFraseId(int fraseId) {
        this.fraseId = fraseId;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public int getTopicoId() {
        return topicoId;
    }

    public void setTopicoId(int topicoId) {
        this.topicoId = topicoId;
    }

    public void listFrases() {
        listaFrases = new ArrayList();
        try {
            FrasesDA result = new FrasesDA();
            listaFrases = result.listFrases();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
