package com.mycompany.proyectoo;

public class Carro implements HuellaDeCarbono {
    private String modelo;
    private double galones;

    public Carro(String modelo, double galones) {
        this.modelo = modelo;
        this.galones = galones;
    }

    @Override
    public double TraerHuellaDeCarbono() {
        return galones * 8.8;
    }

    @Override
    public String TraerInfo() {
        return "Auto: " + modelo + " (Consumo: " + galones + " gal)";
    }
}