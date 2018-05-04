/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundodezuul;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Analizador {
    private PalabrasComando comandos;  // contiene todas las palabras comando
    private Scanner lector;         // entrada de comandos

    /**
     * Crea un analizador para leer desde una terminal.
     */
    public Analizador() 
    {
        comandos = new PalabrasComando();
        lector = new Scanner(System.in);
    }

    /**
     * @return el siguiente comando del usuario
     */
    public Comando getComando() 
    {
        String lineaIngresada;   // va a contenter toda una linea
        String palabra1 = null;
        String palabra2 = null;

        System.out.print("> ");     // imprime prompt

        lineaIngresada = lector.nextLine();

        // Encuantra hasta dos palabras de la linea.
        Scanner separador = new Scanner(lineaIngresada);
        if(separador.hasNext()) {
            palabra1 = separador.next();      // obtiene la primer palabra
            if(separador.hasNext()) {
                palabra2 = separador.next();      // obtiene la segunda palabra
                // se ignora el resto de la línea
            }
        }

        // Ahora se verifica si la palabra es conocida. Si es así, crea un
        // comando con ella. si no, crea un comando "null" (para comandos 
        // desconocidos).
        if(comandos.esComando(palabra1)) {
            return new Comando(palabra1, palabra2);
        }
        else {
            return new Comando(null, palabra2); 
        }
    }

    /**
     * Imprime una lista de todos los comandos válidos.
     */
    public void mostrarComandos()
    {
        comandos.mostrarTodo();
    }
}
