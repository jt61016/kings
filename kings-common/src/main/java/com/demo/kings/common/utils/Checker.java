package com.demo.kings.common.utils;

import com.demo.kings.common.dto.Response;
import com.demo.kings.common.exception.ServiceResponseException;

import java.util.Objects;

/**
 * @author jiangtao
 * @date 2019-09-14 18:27.
 */
public final class Checker {
    public static <T> T success(Response<T> response) {
        if (response.isSuccess()) {
            return response.getData();
        } else {
            throw new ServiceResponseException(response.getMessage());
        }
    }

    public static <T> T success(Response<T> response, String errorMessage) {
        if (response.isSuccess()) {
            return response.getData();
        } else {
            throw new ServiceResponseException(errorMessage);
        }
    }

    public static <T> T ignoreFail(Response<T> response) {
        if (Objects.isNull(response)) {
            return null;
        }
        if (response.isSuccess()) {
            return response.getData();
        } else {
            return null;
        }
    }
}
