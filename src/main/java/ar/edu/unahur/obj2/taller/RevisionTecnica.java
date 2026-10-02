package ar.edu.unahur.obj2.taller;

public class RevisionTecnica extends OrdenDeServicio{

    private static final Double COSTO_MANO_DE_OBRA = 5_000.0;
    protected RevisionTecnica(String patente, EstrategiaDeFacturacion estrategiaDeFacturacion) {
        super(patente, estrategiaDeFacturacion);       
    }
    @Override
    protected String generarNumeroDeOrden() {
       return "OS-REV-" + System.nanoTime(); 
    }
    @Override
    protected Double calcularCostoDemanoDeObra() {
        return COSTO_MANO_DE_OBRA;   
    }    
    
}
