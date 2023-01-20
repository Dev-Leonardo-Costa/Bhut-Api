package com.bhut.bhutapi.service;

import com.bhut.bhutapi.client.ApiTestBhutClient;
import com.bhut.bhutapi.model.Log;
import com.bhut.bhutapi.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {

    @Autowired
    private final LogRepository logRepository;

    @Autowired
    private final ApiTestBhutClient apiTestBhut;

    public Log saveLog(String idCar) {
        Log log = new Log();
        log.setIdCar(idCar);
        return logRepository.save(log);
    }

    public List<Log> listLog() {
        return logRepository.findAll();
    }

}