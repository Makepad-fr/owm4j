package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Coordinate(@JsonProperty("lon") Double lon, @JsonProperty("lat") Double lat) {


}
