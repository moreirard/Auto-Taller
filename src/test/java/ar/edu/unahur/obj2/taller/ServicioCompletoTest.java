package ar.edu.unahur.obj2.taller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ServicioCompletoTest {

    @Test 
    public void dadoServicioCompletoConSOcioDelClub_aplicaDescuentoYGarantia() {

        ServicioCompleto orden = new ServicioCompleto("AA123BB", new FacturacionSocioDelClub());

        orden.finalizarOrden();

        assertTrue(orden.getNumeroDeOrden().startsWith("OS-COM-"));
        assertEquals(11_000.0, orden.getCostoFinal());
        assertTrue(orden.tieneGarantiaExtendida());
    }


}
