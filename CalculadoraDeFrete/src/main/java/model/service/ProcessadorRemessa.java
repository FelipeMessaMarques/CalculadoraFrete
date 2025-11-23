package model.service;

import model.entities.Remessa;

public class ProcessadorRemessa {

    private CalculadoraFrete calculadoraFrete;

    public ProcessadorRemessa(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public double processar(Remessa remessa) {
        return calculadoraFrete.calcular(remessa);
    }
}
