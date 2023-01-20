package com.bhut.bhutapi.service;

import com.bhut.bhutapi.client.ApiTestBhutClient;
import com.bhut.bhutapi.dto.CarDTO;
import com.bhut.bhutapi.dto.CarDTOInput;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CarService {
    @Autowired
    private final ApiTestBhutClient apiTestBhut;

    @Autowired
    private final LogService logService;

    public List<CarDTO> getCars() {
        return apiTestBhut.getCars();
    }

    public CarDTO saveCar(CarDTOInput car) {
        CarDTO newCar = apiTestBhut.saveCar(car);
        logService.saveLog(newCar.get_id());
        return newCar;
    }

}
