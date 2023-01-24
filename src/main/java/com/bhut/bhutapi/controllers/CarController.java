package com.bhut.bhutapi.controllers;

import com.bhut.bhutapi.dtos.CarDTO;
import com.bhut.bhutapi.dtos.CarDTOInput;
import com.bhut.bhutapi.dtos.LogDTO;
import com.bhut.bhutapi.dtos.LogDTOAssembler;
import com.bhut.bhutapi.models.Log;
import com.bhut.bhutapi.repositories.LogRepository;
import com.bhut.bhutapi.services.CarService;
import com.bhut.bhutapi.services.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/api")
public class CarController {

    private final CarService carService;
    private final LogService logService;
    private final LogDTOAssembler assembler;
    private final LogRepository logRepository;

    @GetMapping("/listCars")
    public ResponseEntity<List<CarDTO>> getAll() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }

    @PostMapping("/createCar")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO saveCar(@RequestBody CarDTOInput car) {
        return carService.saveCar(car);
    }

    @GetMapping("/logs")
    public List<LogDTO> logGetAll() {
        List<Log> listLog = logService.listLog();
        return assembler.toCollectionModel(listLog);
    }
}