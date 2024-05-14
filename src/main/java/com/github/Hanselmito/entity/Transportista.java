package com.github.Hanselmito.entity;

public abstract class Transportista {
    private String nombre;
    private String color;
    private float medida;

    public Transportista(String nombre, String color, float medida) {
        this.nombre = nombre;
        this.color = color;
        this.medida = medida;
    }

    public abstract double presupuestar(Punto origen, Punto destino, double peso);
}

class EnvioNoDisponibleException extends Exception {
    public EnvioNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
