package com.example.literalura.connections;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GutendexConnect {
    private final String myUrl = "gutendex.com/books";

    public static String myJsonFetchAPI() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("gutendex.com/books"))
                .build();
        //client send data, http request it and then it responds as a string
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
