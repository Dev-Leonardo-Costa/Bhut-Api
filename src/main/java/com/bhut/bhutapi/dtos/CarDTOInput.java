package com.bhut.bhutapi.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarDTOInput {

    private String id;
    private String title;
    private String brand;
    private BigDecimal price;
    private int age;

}