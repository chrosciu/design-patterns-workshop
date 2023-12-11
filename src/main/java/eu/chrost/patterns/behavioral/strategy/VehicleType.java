package eu.chrost.patterns.behavioral.strategy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VehicleType {
    DRONE(null),
    CAR(new CarDistanceCalculationStrategy()),
    TRAIN(null);

    private final DistanceCalculationStrategy strategy;
}
