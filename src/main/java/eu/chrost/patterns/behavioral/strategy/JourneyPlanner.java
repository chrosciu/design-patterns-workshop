package eu.chrost.patterns.behavioral.strategy;

class JourneyPlanner {

    public double calculateJourneyDistance(VehicleType vehicleType, Point start, Point end) {
        var distanceCalculationStrategy = getDistanceCalculationStrategy(vehicleType);
        return distanceCalculationStrategy.calculateDistance(start, end);
//        if (CAR == vehicleType) {
//            return Math.abs(start.x() - end.x()) + Math.abs(start.y() - end.y());
//        } else if (TRAIN == vehicleType) {
//            Point interchange = new Point(0, 0);
//            boolean collinearWithInterchange = 0 == start.x() * end.y() - start.y() * end.x();
//            if (collinearWithInterchange) {
//                return start.distanceTo(end);
//            } else {
//                return start.distanceTo(interchange) + interchange.distanceTo(end);
//            }
//        } else if (DRONE == vehicleType) {
//            //TODO: Implement
//            throw new RuntimeException("Drone distance not implemented yet");
//        } else {
//            throw new IllegalStateException("Unknown vehicle type");
//        }
    }

    private DistanceCalculationStrategy getDistanceCalculationStrategy(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarDistanceCalculationStrategy();
            case TRAIN -> null;
            case DRONE -> null;
        };
    }
}
