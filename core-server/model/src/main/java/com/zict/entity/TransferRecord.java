package com.zict.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guoflytiger
 * @date 2020/8/25 20:36
 */
@Data
@TableName(value = "transfer_record")
public class TransferRecord {

    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;

    private String no;

    private Integer fromAcc;

    private Integer toAcc;

    private Date createTime;

    private BigDecimal amount;

    private String fromName;

    private String toName;

}
