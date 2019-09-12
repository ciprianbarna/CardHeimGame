package game;

public abstract class Carta {
    // Atributos
    private    String name, efecto;

    // Métodos
    /** Constructor
     * @param nombre - nombre de la carta
     * @param efecto - descripción de la carta
     */
    public Carta(String nombre, String efecto)
    {
        this.name = name;
        this.efecto = efecto;
    }

    /* Métodos get  */
    public String getName(){ return name;}
    public String getEfecto(){return efecto;}

    /* Métodos set  */
    public void setName(String name){ this.name = name; }
    public void setEfecto(String efecto){ this.efecto = efecto;}

}
