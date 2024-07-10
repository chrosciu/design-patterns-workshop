package eu.chrost.patterns.behavioral.strategy;

class CarDistanceCalculationStrategy implements DistanceCalculationStrategy {
    @Override
    public double calculateDistance(Point start, Point end) {
        return Math.abs(start.x() - end.x()) + Math.abs(start.y() - end.y());
    }
}
