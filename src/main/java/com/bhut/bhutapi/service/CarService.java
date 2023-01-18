package com.bhut.bhutapi.service;

import com.bhut.bhutapi.client.ApiTestBhutClient;
import com.bhut.bhutapi.dto.CarDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class CarService {

    private final ApiTestBhutClient apiTestBhut;

    public List<CarDTO> getCars(){
        return apiTestBhut.getCars();
    }
}
