package org.example;

import org.json.JSONObject;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class CurrencyConvertor {

    static void convert(String to, String from, double amt) {
        String convertTo = to.toLowerCase();
        String convertFrom = from.toLowerCase();
        String apiKey = "WJLIEC5WymEJR4ZX4xQXT2WF2FE5mPy2";
        String REQUEST_URL =  "https://api.apilayer.com/exchangerates_data/convert?to=" + convertTo +
                "&from=" +convertFrom + "&amount=" + amt;

        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(REQUEST_URL))
                .header("apikey", apiKey)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject jo = new JSONObject(response.body());
            Double result = jo.getDouble("result");
            Double res = Double.valueOf(new DecimalFormat("#.##").format(result));

            if (response.statusCode() == 200) {
                System.out.println("\n" + amt + " " + convertFrom.toUpperCase() + " is " + res + " " + convertTo.toUpperCase());
            } else {
                System.out.println("Bad request. Please try again");
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}