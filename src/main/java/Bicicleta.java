/**
 * @author Alex Saez Lopez
 * @version v0.2
 * Aquesta class es d'un objecte "Bicicleta" que es heredat de la class "Vehicle"
 * Nomes te una propietat (int vel) i ve heredada de la class "Vehicle"
 */

package main.java;

public class Bicicleta extends Vehicle{

    /**
     * El constructor de la class Bicicleta
     * @see Vehicle
     * @param vel La variable velocitat que ve heredada de la class Vehicle
     */
    public Bicicleta(int vel) {
        super(vel);
    }

    /**
     * El constructor de la class Bicicleta (obsolet)
     * @see Vehicle
     * @deprecated La variable "tipus" esta en desús
     * @param vel La variable velocitat que ve heredada de la class Vehicle
     * @param tipus Esta obsolet
     */
    public Bicicleta(int vel, int tipus) {
        super(vel);
    }
}
