package com.xiaomi.base.k.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author: jianglianglong
 * @Date: 2020/7/20 17:12
 */

@SpringBootApplication
@ServletComponentScan
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }


}
