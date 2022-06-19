package io.makepad.openweathermap.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public record OpenWeatherMap(String key) {
    public CurrentWeatherResponse getCurrentWeather(Integer longitude, Integer latitude) throws IOException {

        URL url = new URL(
                "https://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + longitude + "&appid=" + key);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        System.out.println(content);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(url, CurrentWeatherResponse.class);
    }
}
