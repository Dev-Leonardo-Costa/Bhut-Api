package com.bhut.bhutapi.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CarDTOInput {

    @Schema(example = "Fiat Uno")
    private String title;

    @Schema(example = "Fiat")
    private String brand;

    @Schema(example = "15.000")
    private String price;

    @Schema(example = "2012")
    private int age;

}