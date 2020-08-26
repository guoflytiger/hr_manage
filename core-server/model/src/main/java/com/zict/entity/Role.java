package com.zict.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author guoflytiger
 * @date 2020/8/24 15:30
 */
@Data
public class Role implements Serializable {

    private Integer id;

    private String name;

    private String nameZh;

}
