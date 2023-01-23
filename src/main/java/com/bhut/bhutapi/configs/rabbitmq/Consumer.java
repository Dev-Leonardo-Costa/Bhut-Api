package com.bhut.bhutapi.configs.rabbitmq;

import com.bhut.bhutapi.dtos.CarDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "${queue.name}")
    public void consumer(@Payload CarDTO car) {
        System.out.println("mensagem recebida com sucesso"+ car);
    }
}
