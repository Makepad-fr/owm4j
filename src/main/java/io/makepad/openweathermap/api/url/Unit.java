package io.makepad.openweathermap.api.url;

public enum Unit {
    STANDARD,
    METRIC,
    IMPERIAL;

    @Override
    public String toString() {
        return switch (this) {
            case METRIC -> "metric";
            case IMPERIAL -> "imperial";
            case STANDARD -> "standard";
        };
    }
}