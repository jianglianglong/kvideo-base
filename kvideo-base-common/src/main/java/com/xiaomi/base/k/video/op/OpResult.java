package com.xiaomi.base.k.video.op;

/**
 * @author: jianglianglong
 * @Date: 2020/4/3 16:52
 */
public class OpResult<T> {

    private T data;
    /**
     * 0：代表没有错误
     */
    private int errorCode;
    private String errorMessage;

    private OpResult(T data) {
        this.data = data;
        this.errorCode = 0;
        this.errorMessage = null;
    }

    private OpResult(OpResultErrorDefine errorDefine) {
        this.data = null;
        this.errorCode = errorDefine.getErrorCode();
        this.errorMessage = errorDefine.getErrorMessage();
    }

    private OpResult(OpResultErrorDefine errorDefine, String errorMessage) {
        this.data = null;
        this.errorCode = errorDefine.getErrorCode();
        this.errorMessage = errorMessage;
    }

    private OpResult(OpResultErrorDefine errorDefine, T data) {
        this.data = data;
        this.errorCode = errorDefine.getErrorCode();
        this.errorMessage = errorDefine.getErrorMessage();
    }

    /**
     * 生成正确结果
     *
     * @param data
     * @return
     */
    public static <T> OpResult<T> genSuccessResult(T data) {

        return new OpResult<T>(data);
    }

    /**
     * 生成错误结果
     *
     * @param errorDefine
     * @return
     */
    public static <T> OpResult<T> genFailResult(OpResultErrorDefine errorDefine) {

        return new OpResult<T>(errorDefine);
    }

    /**
     * 生成错误结果，用自定义的errorMessage
     *
     * @param errorDefine
     * @param message
     * @return
     */
    public static <T> OpResult<T> genFailResult(OpResultErrorDefine errorDefine, String message) {

        return new OpResult<T>(errorDefine, message);
    }

    /**
     * 生成错误结果，但是也放进去结果，因为有可能有一半是对的
     * 正常的话，不要用
     *
     * @param errorDefine
     * @param data
     * @return
     */
    public static <T> OpResult<T> genFailResultWithData(OpResultErrorDefine errorDefine, T data) {

        return new OpResult<T>(errorDefine, data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
