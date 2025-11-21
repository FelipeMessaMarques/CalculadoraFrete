package model.entities;

import model.service.CalculadoraFrete;

public class Remessa {

    private Double peso;
    private Double distanciaKm;
    private String codigoRastreio;

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

    public String getCodigoRastreio() {
        return codigoRastreio;
    }
}
