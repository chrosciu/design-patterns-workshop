package eu.chrost.patterns.behavioral.strategy;

class JourneyPlanner {

    public double calculateJourneyDistance(VehicleType vehicleType, Point start, Point end) {
        var distanceCalculationStrategy = getDistanceCalculationStrategy(vehicleType);
        return distanceCalculationStrategy.calculateDistance(start, end);
    }

    private DistanceCalculationStrategy getDistanceCalculationStrategy(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarDistanceCalculationStrategy();
            case TRAIN -> new TrainDistanceCalulationStrategy();
            case DRONE -> new DroneDistanceCalculationStrategy();
        };
    }
}
