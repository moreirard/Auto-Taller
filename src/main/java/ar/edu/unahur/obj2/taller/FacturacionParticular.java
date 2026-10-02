package ar.edu.unahur.obj2.taller;

public class FacturacionParticular implements EstrategiaDeFacturacion{

    @Override
    public Double aplicar(Double costoDeManoDeObra) {
        return costoDeManoDeObra;      
    }

}
