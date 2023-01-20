package com.bhut.bhutapi.controller;

import com.bhut.bhutapi.dto.CarDTO;
import com.bhut.bhutapi.dto.CarDTOInput;
import com.bhut.bhutapi.dto.LogDTO;
import com.bhut.bhutapi.dto.LogDTOAssembler;
import com.bhut.bhutapi.model.Log;
import com.bhut.bhutapi.repository.LogRepository;
import com.bhut.bhutapi.service.CarService;
import com.bhut.bhutapi.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CarController {

    @Autowired
    private final CarService carService;
    @Autowired
    private final LogService logService;
    @Autowired
    private final LogDTOAssembler assembler;

    @Autowired
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