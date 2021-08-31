package br.com.mesttra.financial.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PlayerDto {

    @ApiModelProperty(
            value = "Player name",
            name = "name",
            dataType = "String",
            example = "João Almeida")
    private String name;

    @ApiModelProperty(
            value = "Player salary",
            name = "salary",
            dataType = "Double",
            example = "500000")
    private Double salary;
}
