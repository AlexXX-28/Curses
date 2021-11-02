/**
 * @author Alex Saez Lopez
 * @version v0.2
 * Aquesta es la class principal, on nomes tenim l'inicialitzacio d'un nou "Game"
 * Amb la funcio "start" que inicialitza un nou joc
 */

package main.java;

public class Main {

    /**
     * Incialitzacio de "Game" i la crida de "start" per a començar un nou joc
     * @param args Es un array de strings obligatori del metode main
     */
    public static void main(String[] args) {
        new Game().start();
    }
}
