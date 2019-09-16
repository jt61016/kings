package com.demo.kings.common.exception;

/**
 * 业务异常
 *
 * @author jiangtao
 * @date 2019-09-16 22:52.
 */
public class ServiceResponseException extends RuntimeException {
    private static final long serialVersionUID = -8864742080931512624L;

    private String code;
    private String message;

    public ServiceResponseException(String message) {
        super(message);
        this.message = message;
    }
}
