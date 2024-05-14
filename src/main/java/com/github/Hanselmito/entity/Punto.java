package com.github.Hanselmito.entity;

public class Punto {
    private double X;
    private double Y;

    public Punto() {
    }

    public Punto(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
