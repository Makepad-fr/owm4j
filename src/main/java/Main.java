import io.makepad.openweathermap.api.CurrentWeatherResponse;
import io.makepad.openweathermap.api.OpenWeatherMap;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        OpenWeatherMap openWeatherMap = new OpenWeatherMap(System.getenv("OWM_API_KEY"));
        CurrentWeatherResponse currentWeatherResponse = openWeatherMap.getCurrentWeather(35, 139);

    }
}