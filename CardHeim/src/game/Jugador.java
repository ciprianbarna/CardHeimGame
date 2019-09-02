package game;

public class Jugador {
    // Atributos
    private int vida;
    private String nombre;
    private Mano mano;
    private Mazo mazo, descartes;

    // Métodos
    /** Constructor
     *
     * @param nombre - nombre de la carta
     * @param mazo - mazo de cartas con las que se va a jugar
     */
    public Jugador(String nombre, Mazo mazo)
    {
        this.vida = 50;
        this.nombre = nombre;
        this.mazo = mazo;
        descartes = new Mazo();
    }

    // Métodos get
    public int getVida(){return vida;}
    public String getNombre(){return nombre;}
    public Mano getMano(){return mano;}
    public Mazo getMazo(){return mazo;}
    public Mazo getDescartes(){return descartes;}

    // Métodos set
    public void setVida(int vida){this.vida=vida;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMano(Mano mano){this.mano = mano;}
    public void setMazo(Mazo mazo){this.mazo = mazo;}
    public void setDescartes(Mazo descartes){this.descartes = descartes;}
}
