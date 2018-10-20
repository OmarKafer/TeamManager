package omar.marcos.teammanager;

import java.util.ArrayList;

public class Partido {
    int tiempo;
    ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

    public Partido() {

    }

    public Partido(ArrayList<Jugador> listaJugadores) {
        this.tiempo = 0;
        this.listaJugadores = listaJugadores;
    }
}