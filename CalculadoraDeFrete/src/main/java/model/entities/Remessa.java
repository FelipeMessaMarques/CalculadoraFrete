package model.entities;

import model.service.CalculadoraFrete;

public class Remessa {

    private Double peso;
    private Double distanciaKm;
    private static String codigoRastreio;

    public Remessa(Double peso, Double distanciaKm, String codigoRastreio) {
        this.peso = peso;
        this.distanciaKm = distanciaKm;
        this.codigoRastreio = codigoRastreio;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getDistanciaKm() {
        return distanciaKm;
    }

    public static String getCodigoRastreio() {
        return codigoRastreio;
    }
}
