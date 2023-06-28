/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import AccesoDatos.FrasesDA;
import static colgado.colgado.App.listaTopicos;
import java.util.ArrayList;

/**
 *
 * @author Desarrollador
 */
public class TopicoModelo {

    int topicoId;
    String topico;

    public int getTopicoId() {
        return topicoId;
    }

    public void setTopicoId(int topicoId) {
        this.topicoId = topicoId;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public void listTopicos() {
        listaTopicos = new ArrayList();
        try {
            FrasesDA result = new FrasesDA();
            listaTopicos = result.listTopicos();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
