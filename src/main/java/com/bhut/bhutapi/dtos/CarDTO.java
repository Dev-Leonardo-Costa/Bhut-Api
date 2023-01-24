package com.bhut.bhutapi.dtos;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
public class CarDTO implements Serializable {

    private String _id;
    private String title;
    private String brand;
    private String price;
    private int age;
    private int __v;

}
