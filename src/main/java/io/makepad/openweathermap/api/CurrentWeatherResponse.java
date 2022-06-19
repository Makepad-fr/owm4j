package io.makepad.openweathermap.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.makepad.openweathermap.api.model.*;

import java.util.List;


public record CurrentWeatherResponse(
        @JsonProperty("coord") Coordinate coordinate,
        @JsonProperty("weather") List<Weather> weather,
        @JsonProperty("base") String base,
        @JsonProperty("main") MainInfo mainInfo,
        @JsonProperty("visibility") Double visibility,
        @JsonProperty("wind") Wind wind,
        @JsonProperty("clouds") Clouds clouds,
        @JsonProperty("rain") Rain rain,
        @JsonProperty("snow")Snow snow,
        @JsonProperty("dt")Long dt,
        @JsonProperty("sys") Sys sys,
        @JsonProperty("timezone") Long timezone,
        @JsonProperty("id") Integer cityID,
        @JsonProperty("name") String cityName,
        @JsonProperty("cod") Double cod){

}
