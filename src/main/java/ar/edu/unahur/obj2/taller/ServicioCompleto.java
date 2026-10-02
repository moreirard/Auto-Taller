package ar.edu.unahur.obj2.taller;

public class ServicioCompleto extends OrdenDeServicio{

    private static final Double COSTO_MANO_DE_OBRA = 12_000.0;
    private Boolean garantiaExtendida = false;

    protected ServicioCompleto(String patente, EstrategiaDeFacturacion estrategiaDeFacturacion) {
        super(patente, estrategiaDeFacturacion);
    }

    @Override
    protected String generarNumeroDeOrden() {
        return "OS-COM-" + System.nanoTime(); 
    }

    @Override
    protected Double calcularCostoDemanoDeObra() {
        return COSTO_MANO_DE_OBRA;
        
    }

    @Override 
    protected void aplicarBeneficioAdicional() {
        this.garantiaExtendida = true;
    }

    public Boolean tieneGarantiaExtendida() {
        return this.garantiaExtendida;      
    }

   

}
