package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MainInfo(@JsonProperty("temp") Double temp, @JsonProperty("feels_like") Double feelsLike,
                       @JsonProperty("temp_min") Double tempMin, @JsonProperty("temp_max") Double tempMax,
                       @JsonProperty("pressure") Double pressure, @JsonProperty("humidity") Double humidity,
                       @JsonProperty("sea_level") Double seaLevel,@JsonProperty("grnd_level") Double grndLevel
){

}
