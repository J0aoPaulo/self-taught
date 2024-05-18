import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List<String> ceps = new ArrayList<>();
        List<String> cepsJson = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.print("Digite um cep: ");
            String cep = input.nextLine();

            if (cep.equalsIgnoreCase("sair")) break;
            while (cep.length() != 8) {
                System.out.print("Por favor, digite um cep valido: ");
                cep = input.nextLine();
            }
            ceps.add(cep);
        }
        for (String cep : ceps) {
            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        FileWriter fileWriter = new FileWriter("ceps-residenciais.json");
        for (String endereco : cepsJson) {
            fileWriter.write(endereco);
        }
        fileWriter.close();
        System.out.println("Arquivo criado com sucesso");
    }
}