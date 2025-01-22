public class WeatherData {
    private String location;
    private String temperature;
    private String condition;

    public WeatherData(String location, String temperature, String condition) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "location='" + location + '\'' +
                ", temperature='" + temperature + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
