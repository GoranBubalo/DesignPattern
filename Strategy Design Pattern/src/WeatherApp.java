public class WeatherApp {
    private WeatherService weatherService;

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public WeatherData getWeather(String location ) {
        return weatherService.getWeather(location);
    }
}
