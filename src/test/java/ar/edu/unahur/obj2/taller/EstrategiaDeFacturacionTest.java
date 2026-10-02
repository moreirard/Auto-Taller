package ar.edu.unahur.obj2.taller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstrategiaDeFacturacionTest {
        @Test
    public void dadaFacturacionEmpleadoConCostoDeDosoMil_AlAplicar_descuentaLaMitad(){

        EstrategiaDeFacturacion facturacion = new FacturacionEmpleadoDeTaller();

        Double total = facturacion.aplicar(2_000.0);

        assertEquals(1_000.0, total);
        
    }

}
