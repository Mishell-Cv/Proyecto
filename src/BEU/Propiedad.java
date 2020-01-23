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
public class Propiedad {

    private Calendar fecha;
    private float monto;
    private List<Pago> pagos;
    private Cliente cliente;
    private Casa casa;

    public Propiedad() {
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    @Override
    public String toString() {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);
    }

    public void addPago(Pago nuevo) {
        if (pagos == null) {
            pagos = new ArrayList<>();
        }

        pagos.add(nuevo);

    }

}
