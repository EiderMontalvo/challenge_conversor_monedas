package app;

import configuracion.ApiConfig;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteApi {
    public static String obtenerDatos(String origen, String destino) {
        try {
            String url = ApiConfig.BASE_URL + ApiConfig.API_KEY + "/pair/" + origen + "/" + destino;
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response =  cliente.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (Exception e) {
            System.out.println("Error al conectar a la API: " + e.getMessage());
            return null;
        }

    }
}
