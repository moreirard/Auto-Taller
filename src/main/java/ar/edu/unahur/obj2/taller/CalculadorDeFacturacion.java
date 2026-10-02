package ar.edu.unahur.obj2.taller;

public class CalculadorDeFacturacion {

    public Double aplicar(String politica, Double costoDeManoDeObra) {
        if (politica.equals("FLOTA")) {
            return costoDeManoDeObra * 0.85;   
        }  else if  (politica.equals("SOCIO_CLUB")) {
            return costoDeManoDeObra - 1_000.0; 
        }      
        return costoDeManoDeObra;
    }

}
