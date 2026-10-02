package ar.edu.unahur.obj2.taller;

public class FacturacionSocioDelClub implements EstrategiaDeFacturacion{

    @Override
    public Double aplicar(Double costoDeManoDeObra) {
        return costoDeManoDeObra - 1_000.0;       
    }

}
