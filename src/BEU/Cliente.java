/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEU;

import Castillo.Persona;

/**
 *
 * @author Mishell
 */
public class Cliente extends Persona {

    private String correo;
    //private Propiedad propiedad;

    public Cliente() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
