package com.xiaomi.base.k.video.op;

/**
 * 全局错误码枚举
 *
 * @author: jianglianglong
 * @Date: 2020/7/21 11:15
 */
public enum VideoOpResultEnum implements OpResultErrorDefine {

    AUTHOR_SEARCH_IS_NULL(100, "作者为空"),


    NULL_POINTER_EXCEPTION(10000, "空指针异常"),
    UNKNOWN_EXCEPTION(10001, "未知异常"),

    ;

    private final int errorCode;
    private final String errorMessage;

    VideoOpResultEnum(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
