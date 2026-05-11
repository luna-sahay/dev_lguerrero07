package com.mycompany.proyectoo;

public class Bicicleta implements HuellaDeCarbono {
    private String marca;

    public Bicicleta(String marca) {
        this.marca = marca;
    }

    @Override
    public double TraerHuellaDeCarbono() {
        return 0.0;
    }

    @Override
    public String TraerInfo() {
        return "Bicicleta: " + marca;
    }
}