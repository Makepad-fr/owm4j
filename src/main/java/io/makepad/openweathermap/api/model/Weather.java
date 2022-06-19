package io.makepad.openweathermap.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Weather(
        @JsonProperty("id") Integer id,
        @JsonProperty("main") String main,
        @JsonProperty("description") String description,
        @JsonProperty("icon") String icon){
}
