package eu1_ky.paquete.ser;

import eu1_ky.paquete.extensiones.Descuento;
import eu1_ky.paquete.interceptores.MedirTiempo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class PedidoService {

    @Inject 
    @Named("correo")
    Notificacion noti;

    @MedirTiempo 
    public void realizarPedido(Pedido pedido, Descuento descuento){

        System.out.println(".........Realizando pedido..........");
        System.out.println("Codigo: " + pedido.getCodigo());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Valor Original: " + pedido.getValorOriginal());
        System.out.println("Tipo de Cliente: " + pedido.getTipocliente());

        System.out.println("Aplicando descuento segun el tipo de cliente");
        double des = descuento.aplicarDescuento(pedido.getValorOriginal());
        System.out.println("Pedido: " + pedido.getCodigo() + " | Total: " + des);

        noti.notificar(pedido.getCodigo());


    }

}
