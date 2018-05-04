/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundodezuul;

/**
 *
 * @author Romina
 */
public class Comando {
    private String palabraComando;
    private String segundaPalabra;

    /**
     * Crea un objecto comando. Debe proveerse una primera y una segunda palabra,
     * pero una (o ambas) pueden ser null
     * @param primerPalabra La primer palabra del comando. Null si el comando no
     * fue reconocido.
     * @param segundaPalabra La segunda palabra del comando.
     */
    public Comando(String primerPalabra, String segundaPalabra)
    {
        palabraComando = primerPalabra;
        this.segundaPalabra = segundaPalabra;
    }

    /**
     * Devuelve la plabara comando (la primer palabra) de este comando. Si
     * el comando no fue entendido, el resultado es null
     * @return La palabra comando.
     */
    public String getPalabraComando()
    {
        return palabraComando;
    }

    /**
     * @return La segunda palabra de este comando. Devuelve null si no 
     * hay segunda palabra.
     */
    public String getSegundaPalabra()
    {
        return segundaPalabra;
    }

    /**
     * @return true si el comando no fue reconocido.
     */
    public boolean esDesconocido()
    {
        return (palabraComando == null);
    }

    /**
     * @return true si el comando tiene segunda palabra
     */
    public boolean tieneSegundaPalabra()
    {
        return (segundaPalabra != null);
    }

}
