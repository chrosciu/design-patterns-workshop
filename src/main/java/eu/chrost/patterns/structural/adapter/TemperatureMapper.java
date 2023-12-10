package eu.chrost.patterns.structural.adapter;

public class TemperatureMapper {
    public static double celsiusDeltaToFahrenheitDelta(Double celsiusDelta) {
        return celsiusDelta * 1.8;
    }
}
