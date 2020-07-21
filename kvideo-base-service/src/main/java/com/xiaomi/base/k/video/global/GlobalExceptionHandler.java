package com.xiaomi.base.k.video.global;

import com.xiaomi.base.k.video.global.exception.VideoException;
import com.xiaomi.base.k.video.op.OpResult;
import com.xiaomi.base.k.video.op.OpResultErrorDefine;
import com.xiaomi.base.k.video.op.VideoOpResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: jianglianglong
 * @Date: 2020/7/21 14:54
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 全局业务处理异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = VideoException.class)
    public OpResult<OpResultErrorDefine> exceptionHandler(VideoException e) {

        logger.error("发生业务异常！原因是：", e);

        return OpResult.genFailResult(e.getOpResultErrorDefine());

    }

    /**
     * 空指针异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    public OpResult<OpResultErrorDefine> exceptionHandler(NullPointerException e) {

        logger.error("NullPointerException 异常", e);

        return OpResult.genFailResult(VideoOpResultEnum.NULL_POINTER_EXCEPTION);

    }

    /**
     * 未知异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public OpResult<OpResultErrorDefine> exceptionHandler(Exception e) {

        logger.error("未知 异常", e);

        return OpResult.genFailResult(VideoOpResultEnum.UNKNOWN_EXCEPTION);

    }

}
