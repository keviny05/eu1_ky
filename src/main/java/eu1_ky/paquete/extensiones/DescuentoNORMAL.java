package eu1_ky.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoNORMAL  implements Descuento{

    @Override
    public double aplicarDescuento(double precio) {
        return precio;
    }

}
