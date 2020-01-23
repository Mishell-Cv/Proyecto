/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BEU.Casa;
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
public class GestionCasa extends BasePersistencia<Casa> {

    private List<Casa> casas = new ArrayList<>();
    private final String directorio = "Casas";

    public GestionCasa() {
    }

    public List<Casa> getCasas() throws IOException {
        String contenido = this.leer(directorio, "Casas.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Casa>>() {
        }.getType();
        casas = gson.fromJson(contenido, listType);
        return casas;
    }

}
