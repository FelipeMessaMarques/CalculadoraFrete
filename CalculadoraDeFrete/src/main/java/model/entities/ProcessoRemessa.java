package model.entities;

import model.service.CalculadoraFrete;
import model.service.FreteFedex;

public class ProcessoRemessa {

    private Remessa frete;
    private CalculadoraFrete calculadoraFrete;

    public ProcessoRemessa(Remessa frete, CalculadoraFrete calculadoraFrete) {
        this.frete = frete;
        this.calculadoraFrete = calculadoraFrete;
    }

    @Override
    public String toString() {
        return "Código de rastreio: " + frete.getCodigoRastreio()
                + "\nFrete: " + calculadoraFrete.calcular(frete);
    }
}
