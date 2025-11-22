package test;

import model.entities.Remessa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcessoRemessaTest {

    @Test
    void deveCalcularFreteCorretamente() {
        Remessa remessa = new Remessa(100.0, 10.0, "2805");

        double freteFedex = 20 + remessa.getDistanciaKm() * 1.5;
        assertEquals(35, freteFedex);

        double freteDHL = 50 + remessa.getDistanciaKm() * 0.10 + remessa.getPeso() * 0.50;
        assertEquals(101, freteDHL);
    }
}