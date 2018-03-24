package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class ReproductorMusical {

    private List<Cancion> listaDeCanciones;

    public ReproductorMusical() {
        listaDeCanciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        listaDeCanciones.add(cancion);
    }

    public List<Cancion> obtenerListaDeCanciones() {
        return listaDeCanciones;
    }

    public void agregarListaDeCanciones(List<Cancion> listaDeCanciones) {
        this.listaDeCanciones.addAll(listaDeCanciones);
    }

    public int obtenerDuracionTotalDeReproduccion() {

        int duracionTotal = 0;
        for (Cancion cancion: listaDeCanciones) {
            duracionTotal += cancion.getDuracion();
        }
        return duracionTotal;
    }

}
