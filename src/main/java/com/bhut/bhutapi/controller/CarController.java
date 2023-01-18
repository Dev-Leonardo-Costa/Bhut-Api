package com.bhut.bhutapi.controller;

import com.bhut.bhutapi.dto.CarDTO;
import com.bhut.bhutapi.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CarController {

    private final CarService carService;

    @GetMapping("/listCars")
    public ResponseEntity<List<CarDTO>> getAll() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }
}
