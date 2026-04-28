package com.frostycityman.sqlannotator.portfolio_web.common.response;

import java.util.Collections;
import java.util.Map;

public record ApiResponse<T>(boolean success, T data, String message) {

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(true, data, "정상 처리되었습니다.");
    }

    public static <T> ApiResponse<T> ok(T data, String message) {
        return new ApiResponse<>(true, data, message);
    }

    public static ApiResponse<Map<String, Object>> fail(String message) {
        return new ApiResponse<>(false, Collections.emptyMap(), message);
    }
}
