package io.makepad.openweathermap.api.url;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class URLBuilder {
    private Double lon;
    private Double lat;
    private Unit unit;
    private Lang lang;
    private List<Exclude> excludeList;
    private EndPoint endPoint;
    private Long dt;
    private Integer cnt;

    public URLBuilder setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public URLBuilder setCnt(Integer cnt) {
        this.cnt = cnt;
        return this;
    }

    public URLBuilder setLat(double lat) {
        this.lat = lat;
        return this;
    }

    public URLBuilder setLang(Lang lang) {
        this.lang = lang;
        return this;

    }

    public URLBuilder setDt(long dt) {
        this.dt = dt;
        return this;
    }

    public URLBuilder setEndPoint(EndPoint endPoint) {
        this.endPoint = endPoint;
        return this;

    }

    public URLBuilder setUnit(Unit unit) {
        this.unit = unit;
        return this;
    }

    public URLBuilder setExcludeList(List<Exclude> excludeList) {
        this.excludeList = excludeList;
        return this;
    }

    private <T> void verifyNonNull(T param, String errorMessage) {
        if (param == null) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private void verifyParameters() {
        verifyNonNull(this.endPoint, "Endpoint is required");
        verifyNonNull(this.lat, "latitude is required");
        verifyNonNull(this.lon, "longitude is required");

        if (endPoint == EndPoint.ROAD_RISK) {
            verifyNonNull(this.dt, "dt is required");
        }


    }

    private String getQuery(String key, String value) {
        return "%s=%s".formatted(key, value);
    }


    public URL build(String apiKey) throws MalformedURLException {
        this.verifyNonNull(apiKey, "api key is required");
        this.verifyParameters();
        String base = this.endPoint.toString();
        ArrayList<String> queryParams = new ArrayList<>();
        queryParams.add(getQuery("lat", Double.toString(this.lat)));
        queryParams.add(getQuery("lon", Double.toString(this.lon)));
        queryParams.add(getQuery("appid", apiKey));
        switch (this.endPoint) {
            case CURRENT_WEATHER -> {
                if (this.unit != null) {
                    queryParams.add(getQuery("units", this.unit.toString()));
                }
                if (this.lang != null) {
                    queryParams.add(getQuery("lang", this.lang.toString()));
                }
            }
            case HOURLY_FORECAST -> {
                if (this.cnt != null) {
                    queryParams.add(getQuery("cnt", this.cnt.toString()));
                }
                if (this.lang != null) {
                    queryParams.add(getQuery("lang", this.lang.toString()));
                }
            }
            case ONE_CALL -> {
                if (!this.excludeList.isEmpty()) {
                    queryParams.add(getQuery("exclude", this.excludeList.toString()));
                }
                if (this.unit != null) {
                    queryParams.add(getQuery("units", this.unit.toString()));
                }
                if (this.lang != null) {
                    queryParams.add(getQuery("lang", this.lang.toString()));
                }
            }
            case DAILY_FORECAST_16_DAYS, CLIMATIC_FORECAST_30_DAYS -> {
                if (this.cnt != null) {
                    queryParams.add(getQuery("cnt", this.cnt.toString()));
                }
                if (this.unit != null) {
                    queryParams.add(getQuery("units", this.unit.toString()));
                }
                if (this.lang != null) {
                    queryParams.add(getQuery("lang", this.lang.toString()));
                }
            }
            case FIVE_DAY_WEATHER_FORECAST -> {
                if (this.unit != null) {
                    queryParams.add(getQuery("units", this.unit.toString()));
                }
                if (this.cnt != null) {
                    queryParams.add(getQuery("cnt", this.cnt.toString()));
                }
                if (this.lang != null) {
                    queryParams.add(getQuery("lang", this.lang.toString()));
                }
            }


        }
        String q = queryParams.stream().collect(Collectors.joining("&"));
        return new URL("%s?%s".formatted(base, q));

    }
}
