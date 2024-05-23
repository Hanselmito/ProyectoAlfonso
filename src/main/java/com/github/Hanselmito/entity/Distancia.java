/**
 * La clase Distancia es una clase abstracta que proporciona un método para medir la distancia entre dos puntos.
 * Esta clase debe ser extendida por cualquier clase que necesite implementar su propia lógica para medir la distancia.
 *
 * @author Hanselmito
 */
package com.github.Hanselmito.entity;

public abstract class Distancia {
    /**
     * Este método abstracto debe ser implementado por cualquier clase que extienda Distancia.
     * Debe proporcionar la lógica para medir la distancia entre dos puntos.
     *
     * @param origen El punto de origen desde donde se mide la distancia.
     * @param destino El punto de destino hasta donde se mide la distancia.
     * @return La distancia medida entre los dos puntos.
     */
    public abstract double medir(Punto origen, Punto destino);
}