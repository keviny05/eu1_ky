package eu1_ky.paquete;

import eu1_ky.paquete.extensiones.DescuentoNORMAL;
import eu1_ky.paquete.extensiones.DescuentoSOCIO;
import eu1_ky.paquete.extensiones.DescuentoVIP;
import eu1_ky.paquete.ser.Pedido;
import eu1_ky.paquete.ser.PedidoService;
import eu1_ky.paquete.ser.TipoCliente;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    PedidoService pedidoSer;

    @Inject 
    DescuentoNORMAL descNormal;

    @Inject 
    DescuentoVIP descVip;

    
    @Inject 
    DescuentoSOCIO descSocio;

    public static void main(String[] args) {
        Quarkus.run(Main.class,args);
    }
    @Override
    public int run(String... args) throws Exception {

        System.out.println("-------------------------------Iniciando Prueba-------------------------------");
        System.out.println();

        Pedido pedido1 = new Pedido("P001", "Laptop", 1000.00, TipoCliente.VIP);
        Pedido pedido2 = new Pedido("P002", "Mouse", 100.00, TipoCliente.NORMAL);
        Pedido pedido3 = new Pedido("P003", "Teclado", 200.00, TipoCliente.SOCIO);

        pedidoSer.realizarPedido(pedido1, descVip);

        pedidoSer.realizarPedido(pedido2, descNormal);

        pedidoSer.realizarPedido(pedido3, descSocio);

        System.out.println("-------------------------------Fin de la Prueba-------------------------------");

        System.out.println("172219-ky");

        return 0;
    }


}
