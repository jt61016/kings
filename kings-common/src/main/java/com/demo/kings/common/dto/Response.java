package com.demo.kings.common.dto;

import com.demo.kings.common.enums.ErrorCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jiangtao
 * @date 2019-09-14 17:20.
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -6496289226749778398L;

    /**
     * 必填，是否成功
     */
    private boolean success;
    /**
     * 返回结果
     */
    private T data;
    /**
     * 失败必填，错误码
     * @see ErrorCodeEnum
     */
    private String code;
    /**
     * 失败必填，错误提示文案
     */
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> fail(String code, String message) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> failOfMessage(String message) {
        return fail(null, message);
    }

    public static <T> Response<T> failOfCode(String code) {
        return fail(code, null);
    }
}
