package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-example-demo-entity-Student")
@Data
public class Student {
    @ApiModelProperty(value = "null")
    private Integer id;

    /**
     * 名字
     */
    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "null")
    private String phone;

    @ApiModelProperty(value = "null")
    private Integer age;

    @ApiModelProperty(value = "null")
    private Integer testNull;

    @ApiModelProperty(value = "null")
    private Integer version;
}