package com.bhut.bhutapi.client;

import com.bhut.bhutapi.config.FeignClientConfig;
import com.bhut.bhutapi.dto.CarDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-API-TEST-BHUT", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface ApiTestBhutClient {

    @GetMapping
    List<CarDTO> getCars();

}
