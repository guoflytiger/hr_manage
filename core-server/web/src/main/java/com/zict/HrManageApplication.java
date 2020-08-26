package com.zict;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @author guoflytiger
 * @date 2020/8/24 15:24
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
@MapperScan("com.zict.mapper")
public class HrManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrManageApplication.class, args);
    }
}
