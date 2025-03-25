package pe.com.microjoin.luz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LuzApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(LuzApplication.class, args);
	}

	// Habilitar CORS globalmente
	@Override
	public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
		registry.addMapping("/**")  // Permitir todas las rutas
				.allowedOrigins("*")  // Dominio de React
				.allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos HTTP permitidos
				.allowedHeaders("*")  // Todos los encabezados permitidos
				;  // Permitir credenciales (como cookies o cabeceras de autorización)
	}
}
