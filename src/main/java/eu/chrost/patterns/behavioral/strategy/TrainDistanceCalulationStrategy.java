package eu.chrost.patterns.behavioral.strategy;

class TrainDistanceCalulationStrategy implements DistanceCalculationStrategy {
    @Override
    public double calculateDistance(Point start, Point end) {
        Point interchange = new Point(0, 0);
            boolean collinearWithInterchange = 0 == start.x() * end.y() - start.y() * end.x();
            if (collinearWithInterchange) {
                return start.distanceTo(end);
            } else {
                return start.distanceTo(interchange) + interchange.distanceTo(end);
            }
    }
}
