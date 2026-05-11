package com.mycompany.proyectoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EdificioTest {

    @Test
    public void testTraerHuellaDeCarbono() {
        Edificio miEdificio = new Edificio("Torre Central", 100.0);

        double resultadoEsperado = 50.0;
        double resultadoReal = miEdificio.TraerHuellaDeCarbono();
        
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testTraerInfo() {
        Edificio miEdificio = new Edificio("Biblioteca", 200.0);
        String infoEsperada = "Edificio: Biblioteca";
        
        assertEquals(infoEsperada, miEdificio.TraerInfo());
    }
}
