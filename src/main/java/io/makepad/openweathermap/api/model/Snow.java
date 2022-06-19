package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Snow(@JsonProperty("1h") Double snow1h, @JsonProperty("3h") Double snow3h) {
}
