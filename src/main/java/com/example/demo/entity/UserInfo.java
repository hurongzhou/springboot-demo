package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user_info
 * @author 
 */
@Data
public class UserInfo implements Serializable {
    private Long id;

    private String name;

    private String idCard;

    private String address;

    private String phone;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}