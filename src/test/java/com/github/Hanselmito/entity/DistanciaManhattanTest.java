package com.github.Hanselmito.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanciaManhattanTest {

    @Test
    public void testMedir() {
        DistanciaManhattan distanciaManhattan = new DistanciaManhattan();
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(4, 5);

        double resultado = distanciaManhattan.medir(origen, destino);

        assertEquals(7, resultado, "La distancia de Manhattan entre los puntos (1,1) y (4,5) debe ser 7");
    }
}