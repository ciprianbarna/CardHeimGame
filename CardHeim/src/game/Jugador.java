package game;

public class Jugador {
    // Atributos
    private int vida;
    private String nombre;
    private int estado; // El estado por defecto = 0, aturdido = 1, congelado = 2...etc
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
        estado = 0;
    }

    // Métodos relacionados con la mano

    /**
     * @param mazo -> mazo del que se roba la carta (vale tanto para el mazo como el de descartes)
     */
    public void robarCarta(Mazo mazo)
    {
        mano.añadirCarta(mazo.robarCarta());
    }

    /**
     * @param carta -> carta a utilizar
     */
    public void usarCarta(Carta carta)
    {
        descartes.meterCarta(mano.usarCarta(carta));
    }


    // Métodos relacionados con el combate

    /**
     * @param daño -> daño que recibe el usuario
     */
    public void recibirDaño(int daño)
    {
        vida -= daño;
    }


    // Métodos get
    public int getVida(){return vida;}
    public String getNombre(){return nombre;}
    public Mano getMano(){return mano;}
    public Mazo getMazo(){return mazo;}
    public Mazo getDescartes(){return descartes;}
    public int getEstado(){return estado;}

    // Métodos set
    public void setVida(int vida){this.vida=vida;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMano(Mano mano){this.mano = mano;}
    public void setMazo(Mazo mazo){this.mazo = mazo;}
    public void setDescartes(Mazo descartes){this.descartes = descartes;}
    public void setEstado(int estado){this.estado = estado;}
}
