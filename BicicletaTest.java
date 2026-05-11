package com.mycompany.proyectoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BicicletaTest {

    @Test
    public void testTraerHuellaDeCarbono() {
        // 1. Preparar: Creamos una bicicleta
        Bicicleta miBici = new Bicicleta("Specialized");
        
        // 2. Ejecutar: Obtenemos la huella
        double resultadoReal = miBici.TraerHuellaDeCarbono();
        
        // 3. Verificar: Que sea exactamente 0.0
        assertEquals(0.0, resultadoReal, "La huella de carbono de una bicicleta debe ser 0");
    }

    @Test
    public void testTraerInfo() {
        Bicicleta miBici = new Bicicleta("Trek");
        String infoEsperada = "Bicicleta: Trek";
        
        assertEquals(infoEsperada, miBici.TraerInfo());
    }
}
