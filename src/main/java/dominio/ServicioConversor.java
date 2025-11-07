package dominio;

import app.ClienteApi;

public class ServicioConversor {
    public double convertir(String origen, String destino, double monto) {
        String json = ClienteApi.obtenerDatos(origen, destino);
        double tasa = ConversorMoneda.obtenerTasa(json);
        return monto * tasa;
    }
}
