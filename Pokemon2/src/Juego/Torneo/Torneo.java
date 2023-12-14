package Juego.Torneo;


public class Torneo {
    public static void main(String[] args) {
        // Crear un árbol con los jugadores asignados a los nodos
        ArbolBinario arbol = new ArbolBinario();

        // Nivel 4
        NodoTorneo raiz = arbol.insertar("Jugador1");
        NodoTorneo jugador2 = arbol.insertar("Jugador2");
        NodoTorneo jugador3 = arbol.insertar("Jugador3");
        NodoTorneo jugador4 = arbol.insertar("Jugador4");
        NodoTorneo jugador5 = arbol.insertar("Jugador5");
        NodoTorneo jugador6 = arbol.insertar("Jugador6");
        NodoTorneo jugador7 = arbol.insertar("Jugador7");
        NodoTorneo jugador8 = arbol.insertar("Jugador8");

        // Nivel 3
        NodoTorneo jugador9 = arbol.insertar("Jugador9");
        NodoTorneo jugador10 = arbol.insertar("Jugador10");
        NodoTorneo jugador11 = arbol.insertar("Jugador11");
        NodoTorneo jugador12 = arbol.insertar("Jugador12");
        NodoTorneo jugador13 = arbol.insertar("Jugador13");
        NodoTorneo jugador14 = arbol.insertar("Jugador14");
        NodoTorneo jugador15 = arbol.insertar("Jugador15");
        NodoTorneo jugador16 = arbol.insertar("Jugador16");

        // Simulación del torneo
        arbol.simularTorneo();
    }
}


