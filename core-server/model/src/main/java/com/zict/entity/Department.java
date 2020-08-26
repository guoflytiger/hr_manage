package com.zict.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author guoflytiger
 * @date 2020/8/25 20:30
 */
@TableName(value = "department")
@Data
public class Department {

    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;

    private String name;

    private Boolean enable;

    private Boolean parent;

    private Integer parentId;

    private String depPath;

}
