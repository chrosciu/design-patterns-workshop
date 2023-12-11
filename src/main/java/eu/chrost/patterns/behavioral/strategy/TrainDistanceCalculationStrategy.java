package eu.chrost.patterns.behavioral.strategy;

class TrainDistanceCalculationStrategy implements DistanceCalculationStrategy {
    @Override
    public double calculateDistance(Point start, Point end) {
        Point interchange = Point.of(0, 0);
            boolean collinearWithInterchange = 0 == start.getX() * end.getY() - start.getY() * end.getX();
            if (collinearWithInterchange) {
                return start.distanceTo(end);
            } else {
                return start.distanceTo(interchange) + interchange.distanceTo(end);
            }
    }
}
