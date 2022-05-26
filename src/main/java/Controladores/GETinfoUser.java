package Controladores;


import Configuracion.MiConfiguracion;
import Objetos.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("r1")
public class GETinfoUser {

    /// inyectamos la interfaz Perfiles para poder visualizarlos
    @Autowired
    Perfiles perfiles;
    @Autowired
    Environment env; // para poder acceder a las properties

    @Autowired
    MiConfiguracion miConfiguracion;

    @GetMapping("/parametros")
    public String getPassUrl() {

        return "Hola"; // para ver si funciona el puto postman pero NOOOO
        // return "url: " + env.getProperty("url") + " Password: " + env.getProperty("password") ;// mapping? para poder mandar 2? -> No @Autowired Environment
    }                                                                                         // no es una buena vaina utilizar environment mejor usar @Value

    @GetMapping("/miconfiguracion")
    public String getConfiguracion() {

        return miConfiguracion.toString();
    }

    @GetMapping("/perfil")
    public String getPerfil(@PathVariable String perfil) {

        return perfil;
    }

    // prueba para postman
    @GetMapping("/")
    public String HolaMundo() {
        return "HolaPutoPostman";
    }


}
