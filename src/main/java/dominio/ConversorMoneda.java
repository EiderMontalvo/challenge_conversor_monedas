package dominio;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMoneda {
    public static double obtenerTasa(String json) {
        JsonObject object = JsonParser.parseString(json).getAsJsonObject();
        return object.get("conversion_rate").getAsDouble();
    }
}
