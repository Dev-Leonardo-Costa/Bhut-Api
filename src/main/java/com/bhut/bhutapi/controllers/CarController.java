package com.bhut.bhutapi.controllers;

import com.bhut.bhutapi.models.dtos.CarDTO;
import com.bhut.bhutapi.models.dtos.CarDTOInput;
import com.bhut.bhutapi.models.dtos.LogDTO;
import com.bhut.bhutapi.models.dtos.LogDTOAssembler;
import com.bhut.bhutapi.models.Log;
import com.bhut.bhutapi.repositories.LogRepository;
import com.bhut.bhutapi.services.CarService;
import com.bhut.bhutapi.services.LogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Tag(name = "Car", description = "Manages the car")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/api")
public class CarController {

    private final CarService carService;
    private final LogService logService;
    private final LogDTOAssembler assembler;
    private final LogRepository logRepository;

    @Operation(summary = "Return list the cars")
    @GetMapping("/listCars")
    public ResponseEntity<List<CarDTO>> getAll() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }

    @Operation(summary = "Return car created")
    @PostMapping("/createCar")
    public ResponseEntity<?> saveCar(@RequestBody CarDTOInput car) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.saveCar(car));
    }

    @Operation(summary = "Return list the logs")
    @GetMapping("/logs")
    public ResponseEntity<List<LogDTO>> logGetAll() {
        List<Log> listLog = logService.listLog();
        return ResponseEntity.ok().body(assembler.toCollectionModel(listLog));
    }

}