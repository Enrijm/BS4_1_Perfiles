package formacion.Perfiles;

import Configuracion.MiConfiguracion;
import Objetos.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs41PerfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs41PerfilesApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
		System.out.println("Eooooo que empezamossss");
	}


}
