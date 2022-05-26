package Objetos;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class Perfil2 implements Perfiles {
    // atributos clase
    private final String perfil2 = "Perfil2";

    @Override
    public void miFuncion(){

        System.out.println("Este es el Perfil2");
    }

}
