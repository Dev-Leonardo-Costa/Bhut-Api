package com.bhut.bhutapi.services;

import com.bhut.bhutapi.dtos.CarDTO;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    @PostMapping
    public void toSendCar(CarDTO payload){
        rabbitTemplate.convertAndSend(queue.getName(),payload);
    }
}
