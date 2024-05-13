package conversordemoedas.utils;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ConvertCurrency {

    public static String checkConvertionRate(String currencyBaseCode,
                                           String convertedCurrencyCode, Scanner scan) {
        try {

            String apiKey = "fa346a51e3d0debc41d2f9c9"; // Chave da API
            String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + currencyBaseCode;

            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

            if ( !conversionRates.has(convertedCurrencyCode)) {
                System.out.println("Moéda Inválida.");
                return null;
            }

            // Accessing object
            String req_result = jsonobj.get("result").getAsString();

            System.out.println("Digite quanto de " + currencyBaseCode
                            + " você deseja converter para "+ convertedCurrencyCode + ": ");
            double amountToConvert = scan.nextDouble();











            return req_result;

        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro! Incapaz de conectar com o servidor.");
        }
    }

}

