package com.zict.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guoflytiger
 * @date 2020/8/25 20:33
 */
@TableName(value = "account")
@Data
public class Account {

    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;

    private String number;

    private BigDecimal money;

    private String password;

    private Boolean state;

    private Date createTime;

    private Date deadLine;
}
