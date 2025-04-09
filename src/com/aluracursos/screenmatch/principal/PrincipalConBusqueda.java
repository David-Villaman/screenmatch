package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula");
        String busqueda = scanner.nextLine();

        String direccion = "http://www.omdbapi.com/?t=" + busqueda + "&apikey=77cfba0e";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo titulo = gson.fromJson(json, Titulo.class);
        System.out.println(titulo);
    }
}
