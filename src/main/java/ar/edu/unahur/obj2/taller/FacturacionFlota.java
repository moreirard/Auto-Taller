package ar.edu.unahur.obj2.taller;

public class FacturacionFlota implements EstrategiaDeFacturacion{

    @Override
    public Double aplicar(Double costoDeManoDeObra) {
        return costoDeManoDeObra * 0.85;      
    }

}
