package Juego.Torneo;

public class ArbolBinario {
    private NodoTorneo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public NodoTorneo insertar(String jugador) {
        if (raiz == null) {
            raiz = new NodoTorneo(jugador);
            return raiz;
        } else {
            return insertarRecursivo(raiz, jugador);
        }
    }

    private NodoTorneo insertarRecursivo(NodoTorneo nodo, String jugador) {
        if (nodo == null) {
            return new NodoTorneo(jugador);
        }
        if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
            double random = Math.random();
            int probabilidad = (int) (random * 2);

            if (probabilidad == 0) {
                nodo.setIzquierdo(new NodoTorneo(jugador));
            } else {
                nodo.setDerecho(new NodoTorneo(jugador));
            }
            return nodo;
        }

        double random = Math.random();
        int probabilidad = (int) (random * 2);

        if (probabilidad == 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), jugador));
        } else {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), jugador));
        }

        return nodo;
    }

    public void simularTorneo() {
        System.out.println("Simulación del torneo");
    }
}


