package com.github.Hanselmito.entity;

public class TransportistaFede extends Transportista{
    public TransportistaFede() {
        super("Fede", "marrón", 0);
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        double distancia = calcularDistanciaManhattan(origen, destino);
        if (0 <= distancia && distancia <= 10) {
            return 5;
        } else if (10 < distancia && distancia < 100) {
            return (peso * distancia) / 2;
        } else {
            try {
                throw new EnvioNoDisponibleException("La distancia de " + distancia + " Km no está soportada.");
            } catch (EnvioNoDisponibleException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private double calcularDistanciaManhattan(Punto origen, Punto destino) {
        // Implementación de DistanciaManhattan
        return 0;
    }
}
