package com.freemmy.rest.api.design.first.rest;

import com.freemmy.rest.api.design.first.domain.Car;
import com.freemmy.rest.api.design.first.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@AllArgsConstructor
public class CarRestController {

    private final CarRepository carRepository;

    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {

        return new ResponseEntity<>(carRepository.save(car), HttpStatus.CREATED);
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id) {

        Car car = carRepository.findById(id)
            .orElseThrow(NoSuchElementException::new);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getCars() {

        return ResponseEntity.ok(IterableUtils.toList(carRepository.findAll()));
    }
}
