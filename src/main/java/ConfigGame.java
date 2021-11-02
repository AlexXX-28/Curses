/**
 * @author Alex Saez Lopez
 * @version v0.2
 * En aquesta class tenim la configuracio del joc
 * Tenim les funcions que ens permeten obtenir i establir el numero de voltes i corredors
 * Tambe tenim la configuracio del username
 */

package main.java;

public class ConfigGame {
    private String username;
    private int numRunners;
    private int numTracks;

    /**
     * Aquesta funcio ens permet obtenir el numero de voltes
     * @return Ens retorna el numero de voltes
     */
    public int getNumTracks() {
        return numTracks;
    }

    /**
     * Aquesta funcio ens permet establir el numero de voltes
     * @param numTracks Es el numero de voltes
     */
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    /**
     * Ens permet configurar el joc de manera que tingui:
     * 5 corredors
     * 3 voltes
     * I que el username sigui "player"
     */
    public ConfigGame() {
        numRunners = 5;
        numTracks = 3;
        username = "player";
    }

    /**
     * Ens permet establir l'usuari
     * @param username Es el nom d'usuari
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Ens permet obtenir el username
     * @return Ens retorna el nom d'usuari
     */
    public String getUserName() {
        return username;
    }

    /**
     * Ens permet obtenir el numero de corredors
     * @return Ens retorna el numero de corredors
     */
    public int getNumRunners() {
        return numRunners;
    }

    /**
     * Ens permet establir el numero de corredors
     * @param numRunners Es el numero de corredors
     */
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    /**
     * Ens permet printar tots els parametres que hem establit:
     * Username, Numero de corredors i Numero de voltes
     * @return Ens retorna en format string, el nom d'usuari, el numero de corredors i el numero de voltes
     */
    @Override
    public String toString() {
        return "ConfigGame{" +
                "username='" + username + '\'' +
                ", numRunners=" + numRunners +
                ", numTracks=" + numTracks +
                '}';
    }
}
