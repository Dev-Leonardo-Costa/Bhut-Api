package com.bhut.bhutapi.clients;

import com.bhut.bhutapi.configs.FeignClientConfig;
import com.bhut.bhutapi.models.dtos.CarDTO;
import com.bhut.bhutapi.models.dtos.CarDTOInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "USER-API-TEST-BHUT", url = "${external.api-test-bhut.api.base-url}", configuration = FeignClientConfig.class)
public interface ApiTestBhutClient {

    @GetMapping
    List<CarDTO> getCars();

    @PostMapping
    CarDTO saveCar(@RequestBody CarDTOInput car);

}