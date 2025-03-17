package com.cartrackr.service;

import com.cartrackr.model.Car;
import java.util.List;
import java.util.Optional;

public interface CarService {

    // Get all cars
    List<Car> getAllCars();

    // Get a car by ID
    Optional<Car> getCarById(Long id);

    // Create a new car
    Car createCar(Car car);

    // Update an existing car
    Car updateCar(Long id, Car carDetails);

    // Delete a car by ID
    void deleteCar(Long id);
}
