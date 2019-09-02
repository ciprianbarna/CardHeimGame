package game;

public class Arma extends Carta {
    // Atributos
    private int danio;

    // Métodos
    /** Constructor
     *
     * @param nombre - nombre de la carta
     * @param efecto - descripción de la carta
     * @param danio - daño que inflinge el arma
     */
    public Arma(String nombre, String efecto, int danio) {
        super(nombre, efecto);
        this.danio = danio;
    }
    // Métodos get
    public int getDanio(){return danio;}
    // Métodos set
    public void setDaño(int danio){this.danio = danio;}
}
