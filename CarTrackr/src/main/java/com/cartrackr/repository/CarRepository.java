package com.cartrackr.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.cartrackr.model.Car;


@Repository
public interface CarRepository extends JpaRepositoryImplementation<Car,Long > {

}
