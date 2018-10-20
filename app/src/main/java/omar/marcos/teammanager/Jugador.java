package omar.marcos.teammanager;

public class Jugador {
    int id;
    String nombre;
    int nivel;
    int tiempoJugado;
    int numCambios;
    boolean jugando;

    public Jugador() {

    }

    public Jugador(int id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.tiempoJugado = 0;
        this.numCambios = 0;
        this.jugando = false;
    }

}
