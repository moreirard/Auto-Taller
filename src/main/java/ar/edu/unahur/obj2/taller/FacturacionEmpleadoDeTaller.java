package ar.edu.unahur.obj2.taller;

public class FacturacionEmpleadoDeTaller implements EstrategiaDeFacturacion {

    @Override
    public Double aplicar(Double costoDeManoDeObra) {
        return costoDeManoDeObra * 0.5;       
    }

}
