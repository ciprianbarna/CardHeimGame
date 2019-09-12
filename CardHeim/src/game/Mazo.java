package game;

import java.util.ArrayList;

public class Mazo {

    // Atributos
    private Carta cartas[];
    private boolean vacio;
    private int indice;     // Determina cuantas cartas hay en el mazo y sacaremos indice-1

    // Métodos

    /**
     * Constructor
     */
    public Mazo()
    {
        cartas = new Carta[80];
        vacio = true;
        indice = 0;
    }

    public void meterCarta(Carta carta)
    {
        // Si el mazo no está lleno se pueden meter cartas
        if(indice<=80)
             {
                cartas[indice] = carta;
                indice++;
                if (vacio == true) {
                    vacio = false;
                }
            }
    }

    /* Método para robar carta  */
    public Carta robarCarta()
    {
        // Si el mazo no está vacio
        if(!vacio) {
            // Dejamos el indice decrementado para sacar la carta y saber cual será la que metamos
            indice--;
            // Sacamos la carta antes de eliminarla del mazo
            Carta carta = cartas[indice];
            cartas[indice] = null;

            // Cambiamos la condición
            if(indice==0)
            {
                vacio=true;
            }
            return carta;
        }
        return null;
    }

    /*  Método para barajar */
    public void barajar()
    {
        // Solo tiene sentido si el mazo no está vacio
        if(!vacio)
        {
            Carta auxiliar[] = new Carta[80];
            int i,j ;
            int indiceAux = indice;

            /*
                Ordenación aleatoria de las cartas, explicación:
                    Tomaremos cartas al azar en un rango desde 0 a un indice auxiliar
                    Tomamos una carta, desplazamos todas las siguientes una hacia el origen para
                     hacer como que eliminamos la carta y reducimos el rango del indice auxiliar
                     para poder tomar una carta menos de rango, que queda repetida.

                    El bucle de reordenación tiene de rango indice-1 para evitar que tomemos la
                     última carta y fallé por salirnos del rango del array al desplazar cartas,
                     pues la última ya no tendrá necesidad de usarse al reducir el auxiliar.
             */
            for(i=0; i<indice; i++)
            {
                // Genera un numero aleatorio de 0 a 1, por eso multiplico por el índice
                int rand =(int) (Math.random()*(indiceAux));
                // Tomamos la carta aleatoria
                auxiliar[i] = cartas[rand];
                // Recolocamos el mazo moviendo todas las cartas para sustituir la carta elegida
                for(j=rand; j<indice-1; j++)
                {
                    cartas[j] = cartas[j+1];
                }
                // Reducimos el índice como si hubieramos eliminado la carta
                indiceAux--;

            }
            // Acabamos sustituyendo el mazo por el auxiliar creado
            cartas = auxiliar;
        }
    }

    /* Métodos get */
    public int getIndice(){return indice;}
    public Carta[] getCartas(){return cartas;}
    public boolean estaVacio(){return vacio;}

    /* Métodos set*/
    public void setCartas(Carta cartas[]){ this.cartas = cartas;}
    public void setIndice(int indice)
    {
        this.indice = indice;

        // Arreglamos ya la condición
        if(indice==0)
            {
                vacio=true;
            }
        else
            {
                vacio=false;
            }
    }

}
