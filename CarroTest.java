package com.mycompany.proyectoo; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

public class CarroTest {

    @Test
    public void testTraerHuellaDeCarbono() {
        Carro miCarro = new Carro("Toyota", 10.0);
        
        double resultadoEsperado = 88.0;
        double resultadoReal = miCarro.TraerHuellaDeCarbono();
        
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }
}
