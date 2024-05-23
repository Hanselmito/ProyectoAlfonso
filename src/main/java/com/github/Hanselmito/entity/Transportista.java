/**
 * La clase Transportista es una clase abstracta que representa a un transportista.
 * Esta clase debe ser extendida por cualquier clase que necesite implementar su propia lógica para presupuestar un envío.
 *
 * @author Hanselmito
 */
package com.github.Hanselmito.entity;

public abstract class Transportista {
    private String nombre;
    private String color;
    private float medida;

    /**
     * Constructor de la clase Transportista.
     *
     * @param nombre El nombre del transportista.
     * @param color El color del transportista.
     * @param medida La medida del transportista.
     */
    protected Transportista(String nombre, String color, float medida) {
        this.nombre = nombre;
        this.color = color;
        this.medida = medida;
    }

    /**
     * Este método abstracto debe ser implementado por cualquier clase que extienda Transportista.
     * Debe proporcionar la lógica para presupuestar un envío.
     *
     * @param origen El punto de origen desde donde se realiza el envío.
     * @param destino El punto de destino hasta donde se realiza el envío.
     * @param peso El peso del envío.
     * @return El costo del envío.
     */
    public abstract double presupuestar(Punto origen, Punto destino, double peso);
}

/**
 * La clase EnvioNoDisponibleException es una clase que representa una excepción personalizada.
 * Esta excepción se lanza cuando un envío no está disponible.
 *
 * @author Hanselmito
 */
class EnvioNoDisponibleException extends Exception {
    /**
     * Constructor de la clase EnvioNoDisponibleException.
     *
     * @param mensaje El mensaje de la excepción.
     */
    public EnvioNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}