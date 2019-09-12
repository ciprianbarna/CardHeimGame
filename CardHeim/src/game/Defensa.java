package game;

public class Defensa extends Carta {
    // Atributos
    private int armadura;

    // Métodos
    /**Constructor
     *
     * @param nombre - nombre de la carta
     * @param efecto - descripción de la carta
     * @param armadura - daño que amortigua el objeto
     */
    public Defensa(String nombre, String efecto, int armadura)
    {
        super(nombre, efecto);
        this.armadura = armadura;
    }

    /* Métodos get  */
    public int getArmadura(){return armadura;}

    /* Métodos set  */
    public void setArmadura(int armadura){ this.armadura = armadura;}
}
