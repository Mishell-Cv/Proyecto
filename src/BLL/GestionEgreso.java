/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BEU.Detalle;
import BEU.Egreso;
import Castillo.BasePersistencia;

/**
 *
 * @author Mishell
 */
public class GestionEgreso extends BasePersistencia<Egreso> {

    private Egreso egresos;

    public GestionEgreso() {
    }

    public void setEgresos(Egreso egresos) {
        this.egresos = egresos;
    }

    public void addDetalle(Detalle nuevo) {
        egresos.addDetalle(nuevo);
    }

    public String imprimir(){
        return this.egresos.toString();
    }
}
