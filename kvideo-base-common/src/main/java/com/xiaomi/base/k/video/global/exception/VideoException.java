package com.xiaomi.base.k.video.global.exception;

import com.xiaomi.base.k.video.op.OpResultErrorDefine;

/**
 * 自定义异常
 *
 * @author: jianglianglong
 * @Date: 2020/7/21 11:22
 */
public class VideoException extends RuntimeException {

    private OpResultErrorDefine opResultErrorDefine;


    public VideoException(OpResultErrorDefine opResultErrorDefine) {
        this.opResultErrorDefine = opResultErrorDefine;
    }

    public VideoException(String message) {
        super(message);
    }

    public VideoException(String message, Throwable cause) {
        super(message, cause);
    }

    public VideoException(Throwable cause) {
        super(cause);
    }

    public VideoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public OpResultErrorDefine getOpResultErrorDefine() {
        return opResultErrorDefine;
    }
}
