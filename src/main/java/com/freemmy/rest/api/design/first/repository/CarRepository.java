package com.freemmy.rest.api.design.first.repository;

import com.freemmy.rest.api.design.first.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

}
