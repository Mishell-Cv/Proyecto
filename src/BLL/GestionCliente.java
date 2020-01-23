/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BEU.Cliente;
import Castillo.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishell
 */
public class GestionCliente extends BasePersistencia<Cliente> {

    private List<Cliente> clientes = new ArrayList<>();

    public GestionCliente() {
    }

    public List<Cliente> getClientes() throws IOException {
        String contenido = this.leer("Clientes", "Clientes.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        clientes = gson.fromJson(contenido, listType);
        return clientes;
    }

}
