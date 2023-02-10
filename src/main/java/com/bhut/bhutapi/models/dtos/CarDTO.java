package com.bhut.bhutapi.models.dtos;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

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
