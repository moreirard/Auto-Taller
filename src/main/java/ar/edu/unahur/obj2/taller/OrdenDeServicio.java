package ar.edu.unahur.obj2.taller;

public abstract class OrdenDeServicio {

    protected final String patente;
    protected final EstrategiaDeFacturacion estrategiaDeFacturacion;
    private Double costoFinal;
    private String numeroDeOrden;
    private EstadoDeOrden estado = EstadoDeOrden.PENDIENTE;

    protected  OrdenDeServicio(String patente, EstrategiaDeFacturacion estrategiaDeFacturacion) {
       this.patente = patente;
       this.estrategiaDeFacturacion = estrategiaDeFacturacion;
    }

    // Metodo plantilla: fija el algoritmo, no debe redefinirse
    public final void finalizarOrden() {
        
        Double costoDeManoDeObra = calcularCostoDemanoDeObra();
        this.costoFinal = this.estrategiaDeFacturacion.aplicar(costoDeManoDeObra);
        //  numeroDeOrden = "OS-REV-" + System.nanoTime();
        numeroDeOrden = generarNumeroDeOrden();
        aplicarBeneficioAdicional();
        estado = EstadoDeOrden.FINALIZADA;        
    }

    protected abstract String generarNumeroDeOrden();
    protected abstract Double calcularCostoDemanoDeObra();

    // Hook: sin comportamiento por defecto
    protected void aplicarBeneficioAdicional() {
        //No hacer nada por defecto - debemos revisar
    }

    public String getNumeroDeOrden() {
        return this.numeroDeOrden;       
    }

    public EstadoDeOrden getEstado() {
        return this.estado;       
    }

    public Double getCostoFinal() {
        return this.costoFinal;        
    }

}
