/**
 * @author Alex Saez Lopez
 * @version v0.2
 * Aquesta class es d'un objecte "Cotxe" que es heredat de la class "Vehicle"
 * Les seves propietats privades son "Marca" i "Model"
 */

package main.java;

public class Cotxe extends Vehicle {
	private String Marca;
	private String Model;

	/**
	 * El constructor de la class "Cotxe"
	 * @see Vehicle
	 * @param vel La variable velocitat que ve heredada de la class Vehicle
	 */
	public Cotxe(int vel) {
		super(vel);
	}

	/**
	 * Ens permet obtenir la Marca
	 * @return Ens retorna la Marca
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * Ens permet establir la Marca
	 * @param marca Es la Marca del Vehicle (Audi)
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * Ens permet obtenir el Model
	 * @return Ens retorna el Model del cotxe (A5)
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * Ens permet establir el Model
	 * @param model Es el Model del cotxe (A5)
	 */
	public void setModel(String model) {
		Model = model;
	}



}
