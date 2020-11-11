package com.xiaomi.base.k.video.global.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解 ---
 *
 * @author lianglong jiang
 * @date 2020/11/11 4:10 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String value() default "";
}
