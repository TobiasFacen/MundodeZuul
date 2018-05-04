/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundodezuul;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Romina
 */
public class Habitacion {
    private String descripcion;
    private HashMap<String, Habitacion> salidas;        // almacena las salidas de esta habitación

    /**
     * Crea una habitación descrita por "descripcion". 
     * Inicialmente, la habitacióon no tiene salidas, "descripcion"
     * es algo asi como "una cocina" o "un patio".
     * 
     * @param descripcion La descripcion de la habitacion.
     */
    public Habitacion(String descripcion) 
    {
        this.descripcion = descripcion;
        salidas = new HashMap<String, Habitacion>();
    }

    /**
     * Define las salidas de esta habitación.
     * @param direccion La direccion de la salida
     * @param vecina  La habitacion a la cual esta salida conduce.
     */
    public void establecerSalida(String direccion, Habitacion vecina) 
    {
        salidas.put(direccion, vecina);
    }

    /**
     * @return La descripcion corta de esta habitación
     * (la que se definió en el constructor).
     */
    public String getDescripcionCorta()
    {
        return descripcion;
    }

    /**
     * Devuelve una descripcion de la habitacion en la forma:
     *     Usted esta en la cocina
     *     Salidas: norte oeste
     * @return Una descripcion larga de esta habitación
     */
    public String getDescripcionLarga()
    {
        return "Usted está en  " + descripcion + ".\n" + getStringDeSalidas();
    }

    /**
     * Devuelve una cadena describiendo las salidas de la habitación, por ejemplo
     * "
     * Return a string describing the room's salidas, for example
     * "Salidas: norte oeste".
     * @return Detalles de las salidas de la habitación
     */
    private String getStringDeSalidas()
    {
        String cadena = "Salidas:";
        Set<String> claves = salidas.keySet();
        for(String salida : claves) {
            cadena += " " + salida;
        }
        return cadena;
    }

    /**
     * Devuelve la habitación a la que se llega si vamos desde esta habitación
     * en la dirección "direccion". Si no hay habitaciones en esa dirección,
     * devuelve null.
     * @param direccion La dirección de salida
     * @return La habitación en la dirección señalada
     */
    public Habitacion getSalida(String direccion) 
    {
        return salidas.get(direccion);
    }
}
