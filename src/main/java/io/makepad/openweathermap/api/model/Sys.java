package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Sys(@JsonProperty("type") Double type,
                  @JsonProperty("id") int id,
                  @JsonProperty("message") String message,
                  @JsonProperty("country") String country,
                  @JsonProperty("sunrise") Long sunrise,
                  @JsonProperty("sunset") Long sunset) {
}
