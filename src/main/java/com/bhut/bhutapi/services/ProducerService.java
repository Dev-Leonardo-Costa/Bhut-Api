package com.bhut.bhutapi.services;

import com.bhut.bhutapi.dtos.CarDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class ProducerService {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;
    private final ObjectMapper mapper;

    @SneakyThrows
    @PostMapping
    public void toSendCar(CarDTO car){
        rabbitTemplate.convertAndSend(queue.getName(), mapper.writeValueAsString(car));
    }
}
