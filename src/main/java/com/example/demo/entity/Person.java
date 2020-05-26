package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-example-demo-entity-Person")
@Data
public class Person {
    /**
     * personId
     */
    @ApiModelProperty(value = "personId")
    private Integer personId;

    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private Long phone;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer age;

    /**
     * flag
     */
    @ApiModelProperty(value = "flag")
    private Integer flag;

    /**
     * created
     */
    @ApiModelProperty(value = "created")
    private Date created;

    /**
     * modifie
     */
    @ApiModelProperty(value = "modifie")
    private Date modified;

    /**
     * 薪水
     */
    @ApiModelProperty(value = "薪水")
    private BigDecimal salary;
}