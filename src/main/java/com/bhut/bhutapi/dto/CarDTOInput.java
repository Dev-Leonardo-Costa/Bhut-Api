package com.bhut.bhutapi.dto;

import lombok.Data;

@Data
public class CarDTOInput {

    private String id;
    private String title;
    private String brand;
    private String price;
    private int age;

}