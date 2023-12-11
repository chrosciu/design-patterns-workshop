package eu.chrost.patterns.behavioral.strategy;

class DroneDistanceCalculationStrategy implements DistanceCalculationStrategy {
    @Override
    public double calculateDistance(Point start, Point end) {
        return start.distanceTo(end);
    }
}
