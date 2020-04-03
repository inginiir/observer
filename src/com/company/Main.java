package com.company;

import com.company.observers.CurrentConditionsDisplay;
import com.company.observers.ForeCastDisplay;
import com.company.observers.HeatIndexDisplay;
import com.company.observers.StatisticDisplay;
import com.company.subject.WeatherData;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(35, 40, 745);
        weatherData.setMeasurements(28, 60, 743);
        weatherData.setMeasurements(30, 55, 740);
    }
}
