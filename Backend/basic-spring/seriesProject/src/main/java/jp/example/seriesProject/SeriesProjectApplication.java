package jp.example.seriesProject;

import jp.example.seriesProject.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesProjectApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SeriesProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		String serieJson = consumoApi.obterdados("http://www.omdbapi.com/?t=the+boys&apikey=31542b50");
		System.out.println(serieJson);
	}
}