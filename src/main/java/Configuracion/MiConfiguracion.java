package Configuracion;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
@Data
public class MiConfiguracion {
    // para leer las variables de miconfiguracion.properties
    @Value("${valor1:valor1 no tiene valor}")
    private String valor1;

    @Value("${valor2:valor2 no tiene valor}")
    private String valor2;

    @PostConstruct
    private void PostInit(){
        System.out.println("valor 1: "+valor1);
        System.out.println("valor 2: "+valor2 );

    }
}
