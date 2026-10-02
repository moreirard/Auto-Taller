package ar.edu.unahur.obj2.taller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RevisionTecnicaTest {

    @Test 
    public void dadoRevisionTecnicaConFlota_alFinalizar_elCostoTieneDescuento() {

        RevisionTecnica orden = new RevisionTecnica("AA123BB", new FacturacionFlota());

        orden.finalizarOrden();

        assertTrue(orden.getNumeroDeOrden().startsWith("OS-REV-"));
        assertEquals(EstadoDeOrden.FINALIZADA, orden.getEstado());
        assertEquals(4_250.0, orden.getCostoFinal());
    }

}
