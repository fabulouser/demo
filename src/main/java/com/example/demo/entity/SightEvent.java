package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-example-demo-entity-SightEvent")
@Data
public class SightEvent {
    @ApiModelProperty(value="null")
    private Long id;

    /**
    * 事件名称
    */
    @ApiModelProperty(value="事件名称")
    private String eventName;

    /**
    * 开始时间
    */
    @ApiModelProperty(value="开始时间")
    private Date startTime;

    /**
    * 结束时间
    */
    @ApiModelProperty(value="结束时间")
    private Date endTime;

    /**
    * 0自己  9给学校  32给二级机构
    */
    @ApiModelProperty(value="0自己  9给学校  32给二级机构")
    private Integer selfOrOthers;

    /**
    * 创建用户id
    */
    @ApiModelProperty(value="创建用户id")
    private Integer adminId;

    /**
    * 创建者地区1省级2市级3区级9学校级31一级机构32二级机构
    */
    @ApiModelProperty(value="创建者地区1省级2市级3区级9学校级31一级机构32二级机构")
    private Integer eventType;

    /**
    * 省级市级区级的region_id，如果是学校级的话这里为学校编号，机构的话这个是机构id
    */
    @ApiModelProperty(value="省级市级区级的region_id，如果是学校级的话这里为学校编号，机构的话这个是机构id")
    private String regionId;

    /**
    * 事件的总状态,0未开始,1进行中,2已完成,3未完成；
    */
    @ApiModelProperty(value="事件的总状态,0未开始,1进行中,2已完成,3未完成；")
    private Integer eventStatus;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String remark;

    @ApiModelProperty(value="null")
    private Date created;

    @ApiModelProperty(value="null")
    private Date modified;

    /**
    * 0不删，null删除
    */
    @ApiModelProperty(value="0不删，null删除")
    private Integer isDeleted;

    /**
    * 版本号，乐观锁更新用
    */
    @ApiModelProperty(value="版本号，乐观锁更新用")
    private Integer version;
}