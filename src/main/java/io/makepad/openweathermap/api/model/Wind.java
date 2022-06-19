package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Wind(@JsonProperty("speed") Double speed, @JsonProperty("deg") Double deg,@JsonProperty("gust") Double gust) {
}
