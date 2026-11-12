package eu1_ky.paquete.ser;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
@Named("correo")
public class CorreoService implements Notificacion {

    @Override
    public void notificar(String origen) {
        System.out.println("Notificacion: " + origen);

    }
    
}
