package io.makepad.openweathermap.api.url;

public enum EndPoint {
    CURRENT_WEATHER(false, 2.5, "weather"),
    HOURLY_FORECAST(true, 2.5, "forecast/hourly"),
    ONE_CALL(false, 2.5, "onecall"),
    DAILY_FORECAST_16_DAYS(false, 2.5, "forecast/daily"),
    CLIMATIC_FORECAST_30_DAYS(true, 2.5, "forecast/climate"),
    CURRENT_SOLAR_RADIATION(false, 2.5, "solar_radiation"),
    FIVE_DAY_WEATHER_FORECAST(false, 2.5, "forecast"),
    ROAD_RISK(false, 2.5, "roadrisk");

    private final boolean isPro;
    private final double version;
    private final String path;
    private final static String URL = "https://api.openweathermap.org/data/";
    private final static String PRO_URL = "https://pro.openweathermap.org/data/";

    EndPoint(boolean isPro, double version, String path) {
        this.isPro = isPro;
        this.version = version;
        this.path = path;
    }

    @Override
    public String toString() {
        String base = URL;
        if (this.isPro) {
            base = PRO_URL;
        }
        return "%s%.1f/%s".formatted(base, this.version, this.path);
    }

}
