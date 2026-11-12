package eu1_ky.paquete.interceptores;

import eu1_ky.paquete.ser.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo 
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION) 
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
        long inicio = System.currentTimeMillis();

        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];

        Object result = context.proceed();

        long fin = System.currentTimeMillis();

        System.out.println("Duracion: " + pedido.getCodigo() + " | MS: " + (fin-inicio));
        System.out.println("Tiempo: " + pedido.getCodigo() + " | OK");
        System.out.println();

        return result;
    }
    

}
