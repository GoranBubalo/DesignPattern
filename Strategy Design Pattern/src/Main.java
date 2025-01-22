public class Main {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();

        weatherApp.setWeatherService(new OpenWeatherMapServices());
        WeatherData weatherData = weatherApp.getWeather("Paris");
        System.out.println("OpenWeatherMap - " + weatherData.toString());

        weatherApp.setWeatherService(new WeatherApiService());
        weatherData = weatherApp.getWeather("Madrid");
        System.out.println("WeatherAPI - " + weatherData);


        weatherApp.setWeatherService(new DummyWeatherService());
        weatherData = weatherApp.getWeather("Zadar");
        System.out.println("DummyWeather - " + weatherData);


    }
}