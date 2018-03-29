package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class ReproductorMusical {

    private List<Cancion> listaCanciones = new ArrayList<Cancion>();

    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    public boolean tieneLaCancion(Cancion cancion) {
        return listaCanciones.contains(cancion);
    }
}
