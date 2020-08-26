package com.zict.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * @author guoflytiger
 * @date 2020/8/24 16:42
 */
@Getter
@Setter
public class RespBean implements Serializable {

    private Integer status;

    private String msg;

    private Object obj;

    public RespBean() {
    }

    public RespBean(int status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public static RespBean build() {
        return new RespBean();
    }

    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }

}
