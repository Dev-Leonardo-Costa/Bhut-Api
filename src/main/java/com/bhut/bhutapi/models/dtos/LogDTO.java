package com.bhut.bhutapi.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class LogDTO {

    private String id;
    @JsonFormat(pattern = "dd/MM/yyyy[ HH:mm:ss]")
    private LocalDateTime dateTimeEvent;
    private String idCar;

}
