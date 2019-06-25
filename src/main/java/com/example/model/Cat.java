package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
@ApiModel("猫实体")
@AllArgsConstructor
@Data
public class Cat {
    @ApiModelProperty("猫名字")
    private String name;
    @ApiModelProperty("猫年龄")
    private Integer age;

}
