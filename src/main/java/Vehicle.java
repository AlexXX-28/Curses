/**
 * @author Alex Saez Lopez
 * La class Vehicle es de la que hereden les altres class com (Bicileta/Cotxe)
 * Te una propietat que es pilot que es un objecte de la class "Pilot"
 */

package main.java;

public abstract class Vehicle {
	private int velocitatMAX;
	private Pilot pilot;

	/**
	 * El constructor de la class Vehicle
	 * @deprecated tipus esta en desus
	 * @param vel Ens indica la velocitat
	 */
	public Vehicle(int vel) {
		velocitatMAX = vel;
	}


	/**
	 * El constructor de la class Vehicle (obsolet)
	 * @deprecated La variable tipus esta en desus
	 * @param vel Ens indica la velocitat
	 * @param tipus Esta obsolet
	 */
	public Vehicle(int vel, int tipus) {
		velocitatMAX = vel;
	}

	/**
	 * Ens permet obtenir el pilot
	 * @return Ens retorna el pilot
	 */
	public Pilot getPilot() {
		return pilot;
	}

	/**
	 * Ens permet establir el pilot
	 * @param pilot Es l'objecte de la class Pilot que es el pilot del vehicle
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	/**
	 * Ens permet obtenir la velocitat maxima
	 * @return Ens retorna la velocitat maxima
	 */
	public int getVelocitatMAX() {
		return velocitatMAX;
	}

	/**
	 * Ens permet establit la velocitat maxima
	 * @param velocitatMAX Es la velocitat maxima del vehicle
	 */
	public void setVelocitatMAX(int velocitatMAX) {
		this.velocitatMAX = velocitatMAX;
	}
}
