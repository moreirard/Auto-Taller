package ar.edu.unahur.obj2.taller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CambioDeAceiteTest {

    @Test 
    public void dadoCambioDeAceiteConParticular_alFinalizar_elCostoEsTresMil(){

        CambioDeAceite orden = new CambioDeAceite("AA123BB", new FacturacionParticular());

        orden.finalizarOrden();

        assertTrue(orden.getNumeroDeOrden().startsWith("OS-ACE-"));
        assertEquals(EstadoDeOrden.FINALIZADA, orden.getEstado());
        assertEquals(3_000.0, orden.getCostoFinal());
    }

}
