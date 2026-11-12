package eu1_ky.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements Descuento {

    @Override
    public double aplicarDescuento(double precio) {
        return (precio*0.9);
    }

}
