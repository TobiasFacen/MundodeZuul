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
public class PalabrasComando {
    // un arreglo que contiene las palabras comando
    private static final String[] comandosValidos = {
        "ir", "salir", "ayuda"
    };

    /**
     * Constructor - inicializa las palabras comando
     */
    public PalabrasComando()
    {
        // no hay nada que inicializar por el momento...
    }

    /**
     * Verifica si una cadena es una palabra comando válida 
     * @return true si la cadena es una palabra comando válida
     * false si no lo es.
     */
    public boolean esComando(String unaCadena)
    {
        for(int i = 0; i < comandosValidos.length; i++) {
            if(comandosValidos[i].equals(unaCadena))
                return true;
        }
        // si llegamos aquí, la cadena no fue encontrada entre los comandos válidos
        return false;
    }
    /**
     * Imprime todos los comandos válidos al System.out.
     */
    public void mostrarTodo() 
    {
        for(String comando: comandosValidos) {
            System.out.print(comando + "  ");
        }
        System.out.println();
    }
}
