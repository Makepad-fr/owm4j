package io.makepad.openweathermap.api.url;

public enum Exclude {
    CURRENT,
    MINUTELY,
    HOURLY,
    DAILY,
    ALERTS;

    @Override
    public String toString() {
        return switch (this) {
            case DAILY -> "daily";
            case ALERTS -> "alerts";
            case HOURLY -> "hourly";
            case CURRENT -> "current";
            case MINUTELY -> "minutely";
        };

    }
}
