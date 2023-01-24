package com.bhut.bhutapi.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document
public class Log {

    @Id
    private String id;

    private LocalDateTime dateTimeEvent = LocalDateTime.now();

    private String idCar;
}