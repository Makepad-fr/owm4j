package io.makepad.openweathermap.api.url;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class URLFactory {

    private final String key;

    public URLFactory(String key) {
        this.key = key;
    }

    public URL getCurrentWeatherDataURL(double lon, double lat, Unit units, Lang lan) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setEndPoint(EndPoint.CURRENT_WEATHER).setLat(lat).setUnit(units).setLang(lan).build(key);
    }


    public URL getHourlyForecastDataURL(double lon, double lat, Integer cnt, Lang lang) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setCnt(cnt).setLang(lang).setEndPoint(EndPoint.HOURLY_FORECAST).build(key);
    }

    public URL getOneCallURL(double lon, double lat, List<Exclude> exclude, Unit units, Lang lang) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setExcludeList(exclude).setEndPoint(EndPoint.ONE_CALL).setLang(lang).setUnit(units).build(key);
    }

    public URL getDailyForecast16DaysURL(double lon, double lat, Integer cnt, Unit units, Lang lang) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setCnt(cnt).setEndPoint(EndPoint.DAILY_FORECAST_16_DAYS).setUnit(units).setLang(lang).build(key);
    }

    public URL getClimaticForecast30DaysURL(double lon, double lat, Integer cnt, Unit units, Lang lang) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setLang(lang).setUnit(units).setCnt(cnt).setEndPoint(EndPoint.CLIMATIC_FORECAST_30_DAYS).build(key);
    }

    public URL getCurrentSolarRadiationDataURL(double lon, double lat) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setEndPoint(EndPoint.CURRENT_SOLAR_RADIATION).build(key);
    }

    public URL get5dayWeatherForecastURL(double lon, double lat, Unit units, Integer cnt, Lang lang) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setUnit(units).setCnt(cnt).setLang(lang).setEndPoint(EndPoint.FIVE_DAY_WEATHER_FORECAST).build(key);
    }

    public URL getRoadRiskAPIURL(double lon, double lat, long dt) throws MalformedURLException {
        URLBuilder urlBuilder = new URLBuilder();
        return urlBuilder.setLon(lon).setLat(lat).setDt(dt).setEndPoint(EndPoint.ROAD_RISK).build(key);
    }


}
