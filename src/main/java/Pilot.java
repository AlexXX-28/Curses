/**
 * @author Alex Saez Lopez
 * La class Pilot ens indica el nom, nivell i punts que tindra el pilot d'un vehicle determinat
 */

package main.java;

import java.util.Date;

public class Pilot {
	private String nom;
	private int nivell;
	private int punts;

	/**
	 * El constructor de la class Pilot
	 * @param nom
	 */
	public Pilot(String nom) {
		this.nom = nom;
	}

	/**
	 * Ara tractem els punts de forma diferent
	 * @deprecated Els punts ja no son String
	 */
	public Pilot(String punts) {
		this.punts = punts;
	}

	/**
	 * Ens permet obtenir el nom
	 * @return Ens retorna el nom del pilot
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Ens permet obtenir el punts
	 * @return Ens retorna els punts
	 */
	public int getPunts() {
		return punts;
	}

	/**
	 * Ens permet establir els punts
	 * @param punts Son els punts que te el pilot
	 */
	public void setPunts(int punts) {
		this.punts = punts;
	}

	/**
	 * Ens permet afegir punts
	 * @param p Es la quantitat de punts que afegirem
	 */
	public void addPunts(int p) {
		punts += p;
	}

	@Override
	public String toString() {
		return "Pilot{" +
				"nom='" + nom + '\'' +
				", punts=" + punts +
				'}';
	}
}
