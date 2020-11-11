package com.xiaomi.base.k.video.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Spring AOP 示例
 *
 * @author lianglong jiang
 * @date 2020/11/11 4:03 下午
 */

@Component
@Aspect
@Slf4j
public class KvideoLogAspect {


    /**
     * 切面
     * 1、@annotation 注解形式
     * 2
     */
    @Pointcut(value = "@annotation(com.xiaomi.base.k.video.global.annotation.LogAnnotation)")
    public void pointCut() {

    }

    /**
     * 前置通知
     */
    @Before("pointCut()")
    public void doBeforeAdvice(JoinPoint joinPoint) {
        //
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        log.info("参数---args:{}", Arrays.toString(args));

        //方法名
        String signatureName = signature.getName();
        Class declaringType = signature.getDeclaringType();
        //类的全路径
        String declaringTypeName = signature.getDeclaringTypeName();
        int modifiers = signature.getModifiers();
        //signatureName:getVideoAuthorInfo,declaringType:class com.xiaomi.base.k.video.web.VideoAuthorController,
        //declaringTypeName:com.xiaomi.base.k.video.web.VideoAuthorController,modifiers:1
        log.info("前置执行了---------signatureName:{},declaringType:{},declaringTypeName:{},modifiers:{}", signatureName, declaringType, declaringTypeName, modifiers);

//        MDC 日志追踪
//        AccessibleObject staticPart = joinpoint.getStaticPart();
//        System.out.println(staticPart);
    }

    /**
     * 后置通知
     */
    @After("pointCut()")
    public void doAfterAdvice() {
        log.info("后置执行了======");
    }

    /**
     * 异常处理通知
     *
     * @param exception
     */
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void doAfterThrowingAdvice(Throwable exception) {
        log.info("异常出现了======:{}", exception.getMessage());
    }

}
