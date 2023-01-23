package com.bhut.bhutapi.services;

import com.bhut.bhutapi.clients.ApiTestBhutClient;
import com.bhut.bhutapi.dtos.CarDTO;
import com.bhut.bhutapi.dtos.CarDTOInput;
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
    private final Producer producer;

    @Autowired
    private final LogService logService;

    public List<CarDTO> getCars() {
        return apiTestBhut.getCars();
    }

    public CarDTO saveCar(CarDTOInput car) {
        CarDTO newCar = apiTestBhut.saveCar(car);
        logService.saveLog(newCar.get_id());
        producer.toSendCar(newCar);
        return newCar;
    }

}
