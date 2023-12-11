package eu.chrost.patterns.behavioral.strategy;

class CarDistanceCalculationStrategy implements DistanceCalculationStrategy {
    @Override
    public double calculateDistance(Point start, Point end) {
        return Math.abs(start.getX() - end.getX()) + Math.abs(start.getY() - end.getY());
    }
}
