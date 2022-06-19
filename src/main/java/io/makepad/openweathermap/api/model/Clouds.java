package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Clouds(
        @JsonProperty("all") Double all) {
}
