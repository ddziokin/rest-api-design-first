package com.freemmy.restapidesignfirst.repository;

import com.freemmy.restapidesignfirst.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

}
