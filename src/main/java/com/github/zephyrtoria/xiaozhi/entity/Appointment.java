package com.github.zephyrtoria.xiaozhi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName appointment
 */
@TableName(value ="appointment")
@Data
public class Appointment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String idCard;

    /**
     * 
     */
    private String department;

    /**
     * 
     */
    private String date;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private String doctorName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}