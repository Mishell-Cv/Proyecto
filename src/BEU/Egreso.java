/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEU;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Mishell
 */
public class Egreso {

    private Calendar fecha;
    private String titulo;
    private List<Detalle> detalles = new ArrayList<>();

    public Egreso() {
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void addDetalle(Detalle nuevo) {
        detalles.add(nuevo);
    }

    @Override
    public String toString() {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);

    }

}
