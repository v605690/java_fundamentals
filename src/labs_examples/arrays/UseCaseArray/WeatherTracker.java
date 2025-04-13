package labs_examples.arrays.UseCaseArray;

import java.util.Scanner;

public class WeatherTracker {

    public static void main(String[] args) {

        DailyWeatherData[] weatherData = new DailyWeatherData[30];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < weatherData.length; i++) {
            DailyWeatherData singleDayWeatherData = new DailyWeatherData();

            System.out.println("Enter weather data for day #" + i);
            System.out.println("-------------------------------");

            System.out.println("High temperature: ");
            singleDayWeatherData.setHighTemp(scanner.nextInt());

            System.out.println("Low temperature: ");
            singleDayWeatherData.setLowTemp(scanner.nextInt());

            System.out.println("Rainfall in inches: ");
            singleDayWeatherData.setRainfall(scanner.nextInt());

            System.out.println("Humidity from 0.0 - 1.0: ");
            singleDayWeatherData.setHumidity(scanner.nextDouble());

            System.out.println("Barometric pressure: ");
            singleDayWeatherData.setPressure(scanner.nextInt());

            System.out.println("Wind speed: ");
            singleDayWeatherData.setWindSpeed(scanner.nextInt());

            System.out.println("Wind direction in degrees: ");
            singleDayWeatherData.setWindDirection(scanner.nextInt());

            weatherData[i] = singleDayWeatherData;
        }
    }
}
