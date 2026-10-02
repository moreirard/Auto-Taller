package ar.edu.unahur.obj2.taller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadorDeFacturacionTest {

    @Test
    public void dadPoliticaParticularConCostoDeTresMil_AlAplicar_no_HayDescuento(){

        CalculadorDeFacturacion calculador = new CalculadorDeFacturacion();

        Double total = calculador.aplicar("PARICULAR",3_000.0);

        assertEquals(3_000.0, total);
        
    }

    @Test
    public void dadaPoliticaFlotaConCostoDeCuatroMil_AlAplicar_descuentaQuincePorciento(){

        CalculadorDeFacturacion calculador = new CalculadorDeFacturacion();

        Double total = calculador.aplicar("FLOTA",4_000.0);

        assertEquals(3_400.0, total);
        
    }

    @Test
    public void dadaPoliticaSocioDelClubConCostoDeCincoMil_AlAplicar_descuentaMilFijos(){

        CalculadorDeFacturacion calculador = new CalculadorDeFacturacion();

        Double total = calculador.aplicar("SOCIO_CLUB",5_000.0);

        assertEquals(4_000.0, total);
        
    }


}
