package com.bhut.bhutapi.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class CarDTO {

    private String _id;
    private String title;
    private String brand;
    private String price;
    private Integer age;
    private Integer __v;

}
