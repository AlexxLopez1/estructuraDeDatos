package Juego.Torneo;

public class NodoTorneo {
    private String jugador;
    private NodoTorneo izquierdo;
    private NodoTorneo derecho;

    public NodoTorneo(String jugador) {
        this.jugador = jugador;
        this.izquierdo = null;
        this.derecho = null;
    }

    public String getJugador() {
        return jugador;
    }

    public NodoTorneo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoTorneo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoTorneo getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoTorneo derecho) {
        this.derecho = derecho;
    }
}
