package apiexemplo.example.estudoHttp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Book(
       @JsonProperty("title") String titulo,
       @JsonProperty("author") String autor,
       @JsonProperty("field") String area,
       @JsonProperty("image") String imagem,
       @JsonProperty("publisher") String editora,
       @JsonProperty("publicationYear") int anoDePublicacao,
       @JsonProperty("isbn") String isbn) {}