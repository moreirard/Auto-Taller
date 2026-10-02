package ar.edu.unahur.obj2.taller;

public class CambioDeAceite extends OrdenDeServicio{

    private static final Double COSTO_MANO_DE_OBRA = 3_000.0;
    
    protected CambioDeAceite(String patente, EstrategiaDeFacturacion estrategiaDeFacturacion) {
        super(patente, estrategiaDeFacturacion);
    }

    @Override
    protected String generarNumeroDeOrden() {
        return "OS-ACE-" + System.nanoTime();        
    }

    @Override
    protected Double calcularCostoDemanoDeObra() {
        return COSTO_MANO_DE_OBRA;       
    }

   
}
