/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BEU.Casa;
import BEU.Cliente;
import BEU.Pago;
import BEU.Propiedad;
import Castillo.BaseBllCrud;
import Castillo.BasePersistencia;
import Castillo.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishell
 */
public class GestionPropiedad extends BasePersistencia<Propiedad>
        implements BaseBllCrud<Propiedad> {

    private Propiedad propiedad;
    private final String directorio = "Propiedades";

    public GestionPropiedad() {
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public void addPago(Pago nuevo) {
        propiedad.addPago(nuevo);

    }

    public String imprimir() {

        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(propiedad.getCliente()).append("\n");
        sb.append("Casa: ").append(propiedad.getCasa().getNumero()).append("\n");
        return sb.toString();
    }

    public void archivar() throws IOException {
        this.escribir(directorio, propiedad.getCliente().getNombre(), propiedad);
    }

    public void configurar(Cliente cliente, Casa casa) {
        this.propiedad.setCasa(casa);
        this.propiedad.setCliente(cliente);
    }


    @Override
    public void crear() {
        propiedad = new Propiedad();
    }

    @Override
    public void consultar(String id) throws IOException {
        String archivo = id + ".json";
        String contenido = this.leer(directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        propiedad = gson.fromJson(contenido, Propiedad.class);
    }

    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
