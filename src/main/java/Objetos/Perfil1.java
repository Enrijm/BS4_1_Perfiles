package Objetos;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class Perfil1 implements Perfiles{
    // atributos clase
    private final String perfil1 = "Perfil1";

    @Override
    public void miFuncion(){

        System.out.println("Este es el Perfil1");
    }

}
