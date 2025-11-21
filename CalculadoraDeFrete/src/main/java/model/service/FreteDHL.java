package model.service;

import model.entities.Remessa;

public class FreteDHL implements CalculadoraFrete{
    @Override
    public double calcular(Remessa remessa) {
        return 50 + remessa.getDistanciaKm() * 0.10 + remessa.getPeso() * 0.50;
    }
}
