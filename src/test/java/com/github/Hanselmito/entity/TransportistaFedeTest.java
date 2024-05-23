package com.github.Hanselmito.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TransportistaFedeTest {

    @Test
    protected void testPresupuestar() {
        TransportistaFede transportistaFede = new TransportistaFede();
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(4, 5);

        // Test para distancia <= 10
        double resultado = transportistaFede.presupuestar(origen, destino, 2);
        assertEquals(5, resultado, "El presupuesto para una distancia <= 10 debe ser 5");

        // Test para 10 < distancia < 100
        // Ajusta las coordenadas para que la distancia sea 56
        destino = new Punto(1, 57);
        resultado = transportistaFede.presupuestar(origen, destino, 2);
        assertEquals(56, resultado, "El presupuesto para una distancia entre 10 y 100 debe ser (peso * distancia) / 2");

        // Test para distancia >= 100
        destino = new Punto(10, 100);
        Punto finalDestino = destino;
        assertThrows(RuntimeException.class, () -> transportistaFede.presupuestar(origen, finalDestino, 2), "Debe lanzar una excepción para distancias >= 100");
    }
}