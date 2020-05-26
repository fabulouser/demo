package com.example.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class AddOneNotifyForSchoolAdministratorVM {

    /**
     * 通知标题
     */
    @NotBlank(message = "通知标题不能为空")
    private String title;

    /**
     * 通知内容
     */
    @NotBlank(message = "通知内容不能为空")
    private String sendContent;

    /**
     * 通知图片
     */
    private String imageUrl;

    /**
     * 后台管理员账号
     */
    @NotBlank(message = "后台管理员账号不能为空")
    private String sendAccount;


    /**
     * 接收教师编号
     */
    @NotBlank(message = "接收教师编号不能为空")
    private String receiverTeacherCompositeNumbers;


    /**
     * 学校编号
     */
    @NotBlank(message = "学校编号不能为空")
    private Long schoolNumber;



}
