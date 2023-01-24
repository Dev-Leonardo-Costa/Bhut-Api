package com.bhut.bhutapi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class LogDTO {

    private String id;
    private LocalDateTime dateTimeEvent;
    private String idCar;

}
