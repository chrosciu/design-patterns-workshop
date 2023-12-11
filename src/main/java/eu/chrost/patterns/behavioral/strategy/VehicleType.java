package eu.chrost.patterns.behavioral.strategy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VehicleType {
    DRONE(new DroneDistanceCalculationStrategy()),
    CAR(new CarDistanceCalculationStrategy()),
    TRAIN(new TrainDistanceCalculationStrategy());

    private final DistanceCalculationStrategy strategy;
}
