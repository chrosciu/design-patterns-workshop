package eu.chrost.patterns.behavioral.strategy;

import static eu.chrost.patterns.behavioral.strategy.VehicleType.CAR;
import static eu.chrost.patterns.behavioral.strategy.VehicleType.DRONE;
import static eu.chrost.patterns.behavioral.strategy.VehicleType.TRAIN;

public class JourneyPlanner {

    public double calculateJourneyDistance(VehicleType vehicleType, Point start, Point end) {
        var strategy = vehicleType.getStrategy();
        return strategy.calculateDistance(start, end);
    }
}
