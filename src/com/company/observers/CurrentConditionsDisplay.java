package com.company.observers;

import com.company.subject.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "C degrees, " + humidity
                + "% humidity and pressure: " + pressure + "Pa");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
