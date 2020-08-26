package com.zict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author guoflytiger
 * @date 2020/8/24 15:24
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
