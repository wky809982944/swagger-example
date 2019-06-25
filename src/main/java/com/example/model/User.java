package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("用户实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("年龄")
    private int age;
}
