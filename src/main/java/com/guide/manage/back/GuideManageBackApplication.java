package com.guide.manage.back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * --spring.profiles.active=dev -Dlemon.logger.level=DEBUG
 *
 * @author H
 */
@SpringBootApplication
@MapperScan("com.guide.manage.back.mapper ")
public class GuideManageBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuideManageBackApplication.class, args);
    }

}
