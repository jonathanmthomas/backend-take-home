package com.jmtdroid;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Forismatic {
    // TODO Make the base uri a configurable variable so it can be changed as an environment variable
    // TODO Extend class to allow for setting of each of these options instead of just language
    // For now, just hardcode most of the options since the requirement is only to swap language options
    private static String uri = "http://api.forismatic.com/api/1.0/?method=getQuote&key=457653&format=text&lang=";

    // Fetches results from the forismatic.com quote api (http://forismatic.com/en/api/)
    public static String getQuote(String language) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri + language))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Failure to Retrieve Quote";
    }
}
