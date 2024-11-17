package org.toastit_v2.core.common.util.response;

import org.toastit_v2.core.common.web.response.SuccessResponse;
import org.toastit_v2.core.common.application.code.ResponseCode;
import org.springframework.http.ResponseEntity;

public class SuccessResponseUtil {

    private SuccessResponseUtil() {
    }

    public static <T> ResponseEntity<Object> handleResponseForSuccess(final ResponseCode responseCode, T data) {
        return ResponseEntity.status(responseCode.getHttpStatus())
                .body(buildSuccessResponse(responseCode, data));
    }

    private static <T> SuccessResponse<T> buildSuccessResponse(final ResponseCode responseCode, T data) {
        return SuccessResponse.<T>builder()
                .status(responseCode.getHttpStatus().toString())
                .code(responseCode.name())
                .data(data)
                .msg(responseCode.getData())
                .build();
    }
}