package com.zict.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoflytiger
 * @date 2020/8/24 15:24
 */
@Data
public class Menu implements Serializable {

    private Integer id ;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Boolean keepAlive;

    private Boolean requireAuth;

    private Integer parentId;

    private Boolean enabled;

    @TableField(exist = false)
    private List<Menu> children;

    @TableField(exist = false)
    private List<Role> roles = new ArrayList<>();

}
