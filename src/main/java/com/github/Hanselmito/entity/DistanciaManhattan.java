package com.github.Hanselmito.entity;

public class DistanciaManhattan extends Distancia{

    @Override
    public double medir(Punto origen, Punto destino) {
        double distancia = Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
        return distancia;
    }
}
