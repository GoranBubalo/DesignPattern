public interface WeatherService {
    WeatherData getWeather(String location);
}

class OpenWeatherMapServices implements WeatherService {
    @Override
    public WeatherData getWeather(String location) {
        return  new WeatherData(location, "20C", "Sunny");
    }

}

class WeatherApiService implements WeatherService {
    @Override
    public WeatherData getWeather(String location) {
        return  new WeatherData(location, "14C", "Cloudy");
    }
}

class DummyWeatherService implements WeatherService {
    @Override
    public WeatherData getWeather(String location) {
        return new WeatherData(location , "25°C", "Sunny");
    }

}