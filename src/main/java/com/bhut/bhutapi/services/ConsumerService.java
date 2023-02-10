package com.bhut.bhutapi.services;

import com.bhut.bhutapi.models.dtos.CarDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class ConsumerService {

    private final ObjectMapper mapper;

    private final WebHookService webHookService;

    @RabbitListener(queues = "${queue.name}")
    public void consumer(@Payload Message message) throws IOException {
        var car = mapper.readValue(message.getBody(), CarDTO.class);
        webHookService.notifyAll(car);
    }

}