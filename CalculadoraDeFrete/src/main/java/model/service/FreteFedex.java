package model.service;

import model.entities.Remessa;

public class FreteFedex implements CalculadoraFrete{

    @Override
    public double calcular(Remessa remessa) {
        return 20 + remessa.getDistanciaKm() * 1.50;
    }
}
