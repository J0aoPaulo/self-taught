package apiexemplo.example.estudoHttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EstudoHttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoHttpApplication.class, args);
	}

}
