package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Rain(@JsonProperty("1h") Double rain1h, @JsonProperty("3h") Double rain3h) {
}
