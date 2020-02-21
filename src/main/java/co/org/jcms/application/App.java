package co.org.jcms.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1 - SpringBoot Configuration - Inicializa Spring Boot Application e implementa command line runner para habilitar la consola de comandos
@SpringBootApplication
public class App implements CommandLineRunner {

	public static void main(String[] args) {

		
		// 1 - SpringBoot Configuration - Inicializa el microservicio con SpringBoot - Base de Inicio
		SpringApplication.run(App.class, args);

	}

	// 1 - SpringBoot Configuration - Implementa run
	@Override
	public void run(String... args) throws Exception {

		System.out.println("El micro servicio Spring Boot para  java-jcms-ex-1 ha iniciado");

	}

}
