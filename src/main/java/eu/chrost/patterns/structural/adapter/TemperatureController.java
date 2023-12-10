package eu.chrost.patterns.structural.adapter;

public interface TemperatureController {
    void temperatureUp(double deltaInCelsius);
    void temperatureDown(double deltaInCelsius);
}
