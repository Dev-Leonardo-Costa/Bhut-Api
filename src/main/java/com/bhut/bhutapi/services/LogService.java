package com.bhut.bhutapi.services;

import com.bhut.bhutapi.clients.ApiTestBhutClient;
import com.bhut.bhutapi.models.Log;
import com.bhut.bhutapi.repositories.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class LogService {

    private final LogRepository logRepository;
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