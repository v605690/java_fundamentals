package labs_examples.arrays.UseCaseArray;

public class DailyWeatherData {

    private int highTemp;
    private int lowTemp;

    private double rainfall;
    private double humidity;

    private double pressure;

    private int windSpeed;
    private int windDirection;

    public DailyWeatherData(int highTemp, int lowTemp, double rainfall, double humidity, double pressure, int windSpeed, int windDirection) {
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.rainfall = rainfall;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public DailyWeatherData() {

    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }
}
