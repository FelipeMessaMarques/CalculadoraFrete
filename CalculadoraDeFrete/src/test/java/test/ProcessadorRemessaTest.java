package test;

import model.entities.Remessa;
import model.service.CalculadoraFrete;
import model.service.ProcessadorRemessa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

class ProcessadorRemessaTest {

    private static final double VALOR_MOCKADO_ESPERADO = 100.00;

    @Test
    void processar_DeveRetornarValorMockado_ProvandoIsolamento() {

        CalculadoraFrete mockCalculadora = mock(CalculadoraFrete.class);

        when(mockCalculadora.calcular(any(Remessa.class)))
                .thenReturn(VALOR_MOCKADO_ESPERADO);

        ProcessadorRemessa processador = new ProcessadorRemessa(mockCalculadora);

        Remessa remessa = new Remessa(10.0, 100.0, "ABC123Z");

        double resultadoFrete = processador.processar(remessa);

        assertEquals(VALOR_MOCKADO_ESPERADO, resultadoFrete, 0.001,
                "O resultado deve ser o valor mockado, provando que o Processador está isolado e apenas delega o cálculo.");
    }
}